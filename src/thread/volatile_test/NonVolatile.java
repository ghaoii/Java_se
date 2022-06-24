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
