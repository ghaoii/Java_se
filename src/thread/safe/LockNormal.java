package thread.safe;

public class LockNormal {
    private static class Counter {
        int val;

        Object lock;
        void increase() {
            System.out.println("不要同步的代码");

            //括号里可以传入任意对象，传什么就锁什么
            synchronized (lock) {
                while(true) {
                    System.out.println(Thread.currentThread().getName() + "执行同步代码块里的内容");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Counter c1 = new Counter();
        c1.lock = lock;
        Counter c2 = new Counter();
        c2.lock = lock;
        Counter c3 = new Counter();
        c3.lock = new Object();
        Thread t1 = new Thread(() -> {
           c1.increase();
        }, "t1");
        Thread t2 = new Thread(() -> {
            c2.increase();
        }, "t2");
        Thread t3 = new Thread(() -> {
            c3.increase();
        }, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
