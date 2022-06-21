package thread.state;

/**
 * 撒种阻塞状态
 */
public class BlockedState {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    // TIMED_WAITING - 等待时间到了，自动唤醒
                    //Thread.sleep(1000);
                    lock.wait();
                    System.out.println("t1被唤醒了");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "t1");
        t1.start();
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                // BLOCKED 等待获取锁对象
                System.out.println("t2子线程");
                lock.notify();
            }
        }, "t2");
        t2.start();
    }
}
