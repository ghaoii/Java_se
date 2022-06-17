package thread;

import java.util.concurrent.ThreadLocalRandom;

public class AddByThread {
    private static final int[] arr = new int[1000_0000];

    private static class EvenSum implements Runnable {
        long sum = 0;

        @Override
        public void run() {
            System.out.println("开始计算偶数下标的和");
            for (int i = 1; i < arr.length; i += 2) {
                sum += arr[i];
            }
            System.out.println(Thread.currentThread().getName() + "计算完毕" + "，和为" + sum);
        }
    }

    private static class OddSum implements Runnable {
        long sum = 0;

        @Override
        public void run() {
            System.out.println("开始计算奇数下标的和");
            for (int i = 0; i < arr.length; i += 2) {
                sum += arr[i];
            }
            System.out.println(Thread.currentThread().getName() + "计算完毕" + "，和为" + sum);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        //给数组随机赋值[1, 100]之间的数字
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        //创建线程，进行计算
        EvenSum evenSum = new EvenSum();
        OddSum oddSum = new OddSum();
        Thread t1 = new Thread(evenSum,"偶数下标求和线程");
        Thread t2 = new Thread(oddSum,"奇数下标求和线程");
        //开始计时
        long start = System.nanoTime();
        //启动两个线程开始同时计算
        t1.start();
        t2.start();
        //等待两个线程结束
        t1.join();
        t2.join();
        //将两个线程求得的和相加得到最终的结果
        long sum = evenSum.sum + oddSum.sum;
        //停止计时
        long end = System.nanoTime();
        double allTime = (end - start) * 1.0 / 1000 / 1000;
        System.out.println("数组的和为：" + sum);
        System.out.println("总耗时：" + allTime + "ms");
    }
}
