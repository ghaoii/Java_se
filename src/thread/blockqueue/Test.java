package thread.blockqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Thread consumer = new Thread(() -> {
            while(true) {
                try {
                    int val = blockingQueue.take();
                    System.out.println("消费元素：" + val);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "生产者");
        Random random = new Random();
        Thread producer = new Thread(() -> {
            while(true) {
                try {
                    int val = random.nextInt(100);
                    blockingQueue.put(val);
                    System.out.println("生产元素：" + val);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "消费者");
        consumer.start();
        producer.start();
    }

//    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
//        System.out.println(blockingQueue.take());
//        blockingQueue.put(1);
//    }
}
