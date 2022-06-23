package thread.safe;

public class ThreadUnsafeDemo {
    private static class Counter {
        int count = 0;
        synchronized void increase() {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5_0000; i++) {
                counter.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5_0000; i++) {
                counter.increase();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //主线程走到这里，t1和t2都执行完毕，按理说count应该为10_0000
        System.out.println("count = " + counter.count);
    }
}
// 多次执行结果

