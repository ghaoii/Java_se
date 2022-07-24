package thread.jue_test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        // 等待线程需要等待的线程数，必须要等这10个子线程全部执行完毕再恢复执行
        CountDownLatch latch = new CountDownLatch(10);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt(1000));
                    System.out.println(Thread.currentThread().getName() + "到达终点");
                    // 计数器-1
                    latch.countDown();
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable, i + 1 + "号运动员");
            thread.start();
        }

        // main线程就是裁判线程，需要等待所有运动员到达终点在恢复执行(宣布比赛结束)
        // 直到所有线程调用countdown方法将计时器减为0继续执行
        latch.await();
        System.out.println("所有运动员全部到达终点");
    }
}
