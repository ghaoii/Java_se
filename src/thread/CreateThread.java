package thread;

public class CreateThread {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("通过继承Thread类创建的线程～");
        }
    }

    private static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println("通过实现Runnable接口创建的线程～");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread();

        MyRun myRun = new MyRun();
        Thread t2 = new Thread(myRun);

        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("匿名内部类继承Thread的方式创建线程～");
            }
        };

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类实现Runnable接口的方式创建线程～");
            }
        });

        Thread t5 = new Thread(() -> System.out.println("Lambda表达式的方式创建线程～"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
