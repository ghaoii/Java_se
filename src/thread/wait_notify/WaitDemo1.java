package thread.wait_notify;

public class WaitDemo1 {
    private static class WaitTask implements Runnable {
        private Object lock;

        public WaitTask(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "准备进入等待状态");
                // 此线程在等待lock对象的notify方法唤醒
                try {
                    lock.wait();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "等待结束，本线程继续执行");
            }
        }
    }

    private static class NotifyTask implements Runnable {
        private Object lock;

        public NotifyTask(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("准备唤醒");
                // 随机唤醒一个处在lock对象上等待的线程
                lock.notifyAll();
                System.out.println("唤醒结束");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        // 创建三个线程
        Thread t1 = new Thread(new WaitTask(lock), "t1");
        Thread t2 = new Thread(new WaitTask(lock), "t2");
        Thread t3 = new Thread(new WaitTask(lock), "t3");
        // 创建一个唤醒线程
        Thread notify = new Thread(new NotifyTask(lock), "notify线程");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);
        notify.start();
    }
}
