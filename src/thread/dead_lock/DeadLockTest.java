package thread.dead_lock;

public class DeadLockTest {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("我现在开始学习了");
                synchronized (lock1) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("学习结束! 我想看t2表演~");
                }
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("等t1学习结束之后，我再给他来个才艺展示~");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("可以, 我给你展示一下我的才艺~");
                }
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
