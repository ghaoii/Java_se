package thread;

/**
 * 线程等待 - join - 成员方法
 */
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "：还在学习JavaSE阶段...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "JavaSE线程");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "：进入数据结构阶段...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "数据结构线程");

        // 串行执行
        System.out.println("先学习JavaSE部分");
//        t1.start();
//        t1.join();
        //此时走到这里，t1线程已经执行结束，再启动t2线程
        t2.start();
        //主线程只等t2等2000ms，无论t2在这时间内有没有结束，主线程都会恢复执行
        t2.join(2000);
        //此时t2也执行结束了，恢复执行主线程
        System.out.println("开始学习JavaEE");
    }
}
