package thread.state;

/**
 * 线程的新建，运行和终止状态
 */
public class NewAndRunnable {
//    public static void main(String[] args) {
//        Thread t = new Thread(() -> {
//            for (int i = 0; i < 1000_0000; i++) {}
//        });
//        System.out.println(t.getName() + "状态：" + t.getState());// Thread-0状态：NEW
//        t.start();
//        while(t.isAlive()) {
//            // 除了NEW和TERMINATED状态，其他状态都是存活状态
//            System.out.println(t.getName() + "状态：" + t.getState());// Thread-0状态：RUNNABLE
//        }
//        // run方法执行完毕的线程进入TERMINATED状态
//        System.out.println(t.getName() + "状态：" + t.getState());// Thread-0状态：TERMINATED
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "t1子线程");
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "t2子线程");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t1.getState());
    }
}
