package thread;

/**
 * 方式1和方式2的不同写法
 */
public class OtherMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Lambda表达式实现Runnable接口"));
        t1.start();
        System.out.println("这是主线程" + Thread.currentThread().getName());
    }

//    public static void main(String[] args) {
//        // 这里即实现了Runnable接口，又进行了传参
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类实现Runnable接口");
//                System.out.println("这是子线程" + Thread.currentThread().getName());
//            }
//        });
//        thread.start();
//        System.out.println("这是主线程" + Thread.currentThread().getName());
//    }

//    public static void main(String[] args) {
//        // 匿名内部类继承Thread类
//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类继承Thread类");
//                System.out.println("这是子线程" + Thread.currentThread().getName());
//            }
//        };
//        t1.start();
//        System.out.println("这是主线程" + Thread.currentThread().getName());
//    }
}
