package thread.call;

public class RunnableCount {
    static class Counter {
        int sum;
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i <= 1000; i++) {
                sum += i;
            }
            synchronized (lock) {
                counter.sum = sum;
                lock.notifyAll();
            }
        });
        t1.start();
        synchronized (lock) {
            if(counter.sum == 0) {
                lock.wait();
            }
        }
        System.out.println("子线程执行结束，结果为: " + counter.sum);
    }
}
