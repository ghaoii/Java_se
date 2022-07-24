package thread.jue_test;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        // 在构造方法中传入可用资源的个数
        // 可用资源为5个
        Semaphore semaphore = new Semaphore(5);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + "准备获取资源");
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "获取资源成功");
                    Thread.sleep(1000);
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + "释放资源");
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // 一次性传入20个线程，而资源只有5个
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(runnable, String.valueOf(i + 1));
            thread.start();
        }
    }
}
