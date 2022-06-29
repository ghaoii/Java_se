package thread.timer;

import java.util.concurrent.PriorityBlockingQueue;

public class MyTimer {
    public static class Task implements Comparable<Task> {
        private Runnable command;
        private long after;

        public Task(Runnable command, long after) {
            this.command = command;
            this.after = after + System.currentTimeMillis();
        }

        public void run() {
            command.run();
        }

        @Override
        public int compareTo(Task o) {
            return (int)(this.after - o.after);
        }
    }

    private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
    private Object mailBox = new Object();

    class Work extends Thread {
        @Override
        public void run() {
            while(true) {
                try {
                    Task task = queue.take();
                    long curTime = System.currentTimeMillis();
                    if(task.after > curTime) {
                        queue.put(task);
                        synchronized (mailBox) {
                            mailBox.wait(task.after - curTime);
                        }
                    }else {
                        task.run();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public MyTimer() {
        Work work = new Work();
        work.start();
    }

    public void schedule(Runnable command, long after) {
        Task task = new Task(command, after);
        queue.put(task);
        synchronized (mailBox) {
            mailBox.notifyAll();
        }
    }

    public static void main(String[] args) {
        MyTimer timer = new MyTimer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("模拟实现计时器~");
            }
        }, 3000);

        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lana Del Rey的演唱会开始了~~");
            }
        }, 10000);
    }
}
