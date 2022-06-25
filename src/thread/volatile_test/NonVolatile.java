package thread.volatile_test;

import java.util.Scanner;

public class NonVolatile {
    private static class Counter {
        int flag = 0;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            // t1将flag加载到工作内存之后一直读取的是当前工作内存的值，t2的修改对t1是不可见的
            while(counter.flag == 0) {
                // 关于这里添加了sleep方法之后，即使没有volatile关键字也被去读取主内存的值的原因
                // 当有了sleep等类似方法的时候，CPU觉得该线程占着资源不合适，就会尝试读取主内存的值
                // 不过这是概率事件，CPU不是百分百的会读取主内存中的值
                // 因此，为了保证线程的安全，还是要使用volatile或synchronized等关键字
                System.out.println("我在循环");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("flag = " + counter.flag + ",退出循环");
        }, "t1");
        t1.start();
        Thread t2 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请改变flag的值");
            counter.flag = scanner.nextInt();
        }, "t2");
        t2.start();
    }
}
