package thread;

/**
 * 通过共享变量中断线程
 */
public class ThreadInterruptByVar {
    private static class MyThread implements Runnable {
        // 多个线程都会用到的变量加上volatile关键字
        // 当前线程是否需要停止
        volatile boolean isQuit = false;

        @Override
        public void run() {
            while(!isQuit) {
                System.out.println(Thread.currentThread().getName() + "Taylor的一对一演唱会进行中～");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "被迫终止了！");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        Thread thread = new Thread(mt, "Taylor的私人演唱会");
        thread.start();
        // 演唱会进行了3s之后，Dua中断了演唱会说：让我来！
        Thread.sleep(3000);
        System.out.println("Dua突然闯进来说想为我唱首歌！！！");
        mt.isQuit = true;
    }
}
