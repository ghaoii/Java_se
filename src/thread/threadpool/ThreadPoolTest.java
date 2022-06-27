package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
        // 固定大小线程池，这里创建了一个大小为10的线程池，一共只有10个线程
        ExecutorService pool = Executors.newFixedThreadPool(10);
        // 数量动态变化的缓存池，根据任务数量的多少，动态创建线程
        ExecutorService pool1 = Executors.newCachedThreadPool();
        // 只包含一个线程的单线程池
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        // 定时器线程池，可以设置任务的延时启动时间(Timer类的线程池实现)
        ScheduledExecutorService pool3 = Executors.newScheduledThreadPool(10);

        pool.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + "，hello~" + i);
                }
            }
        });

        pool3.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "，3s后执行此任务");
            }
        }, 3, TimeUnit.SECONDS);
    }
}
