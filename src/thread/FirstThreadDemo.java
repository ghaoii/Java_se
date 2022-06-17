package thread;

import java.util.Random;

public class FirstThreadDemo {
    private static class MyThread extends Thread {
        //run方法就是线程的核心工作方法，线程要干的所有事情都在run方法中进行定义
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                //打印当前线程的名称
                System.out.println(Thread.currentThread().getName());
                //当前线程随机暂停0-9秒
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        //创建三个线程对象
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();
        //启动三个子线程
        m1.start();
        m2.start();
        m3.start();
        Random random = new Random();
        while (true) {
            //打印当前线程的名称
            System.out.println(Thread.currentThread().getName());
            //当前线程随机暂停0-9秒
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
