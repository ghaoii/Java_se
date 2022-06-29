package thread.blockqueue;

import java.util.Random;

public class MyBlockQueue {
    private int[] value = new int[1000];
    private volatile int size;
    private int head;
    private int tail;

    public void put(int val) throws InterruptedException {
        synchronized (this) {
            while(size == value.length) {
                this.wait();
            }
            value[tail] = val;
            tail = (tail + 1) % value.length;
            size++;
            notifyAll();
        }
    }

    public int take() throws InterruptedException {
        int ret = 0;
        synchronized (this) {
            while(size == 0) {
                wait();
            }
            ret = value[head];
            head = (head + 1) % value.length;
            size--;
            notifyAll();
        }
        return ret;
    }

    public static void main(String[] args) {
        MyBlockQueue blockQueue = new MyBlockQueue();

        Thread consumer = new Thread(() -> {
            while(true) {
                try {
                    int val = blockQueue.take();
                    System.out.println("消费了" + val);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }, "消费者");

        Thread producer = new Thread(() -> {
            Random random = new Random();
            while(true) {
                try {
                    int val = random.nextInt(1000) + 1;
                    blockQueue.put(val);
                    System.out.println("生产了" + val);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }, "生产者");

        consumer.start();
        producer.start();

    }
}
