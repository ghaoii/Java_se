package thread.atomic_test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
    static class Counter {
        // 基于整形的原子类
        AtomicInteger count = new AtomicInteger();

        void increase() {
            // i++
            count.incrementAndGet();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                counter.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                counter.increase();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count.get());// 10000
    }
}
