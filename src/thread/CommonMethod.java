package thread;


public class CommonMethod {
    public static void main(String[] args) {
        //一般搭配子类使用，需要有一个继承了Thread的子类
        // 因为父类中的run方法什么都没干
        Thread t1 = new Thread();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("传入Runnable对象");
            }
        });
        Thread t3 = new Thread("Taylor线程");
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("传入Runnable对象和线程名字");
            }
        }, "Dua线程");
    }
}
