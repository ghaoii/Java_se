package thread;

public class Main {
    public static void main(String[] args) {
        // 1. 继承Thread类
//        // 创建线程类的对象
//        ThreadMethod mt = new ThreadMethod();
//        // 启动子线程
//        mt.start();

        // 2. 实现Runnable接口
        //创建线程任务的对象
        RunnableMethod runnableMethod = new RunnableMethod();
        // 创建线程对象，将任务对象作为参数传入线程对象的构造方法中
        Thread thread = new Thread(runnableMethod);
        //启动线程
        thread.start();
        //执行主线程的语句
        System.out.println("主线程的输出结果");
    }
}
