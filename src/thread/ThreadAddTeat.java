package thread;

/**
 * 串行和并发的时间对比
 */
public class ThreadAddTeat {
    private static final long COUNT = 10_0000_0000;

    public static void main(String[] args) throws InterruptedException {
        serial();
        concurrent();
    }

    //串行方式进行20亿的累加
    private static void serial() {
        long start = System.nanoTime();
        long a = 0;
        for (int i = 0; i < COUNT; i++) {
            a++;
        }
        long b = 0;
        for (int i = 0; i < COUNT; i++) {
            b++;
        }
        long end = System.nanoTime();
        double allTime = (end - start) * 1.0 / 1000 / 1000;
        System.out.println("串行执行共耗时：" + allTime + "ms");
    }

    //并发进行+10亿的操作
    private static void concurrent() throws InterruptedException {
        long start = System.nanoTime();
        //子线程进行+10亿操作
        Thread thread = new Thread(() -> {
            long a = 0;
            for (int i = 0; i < COUNT; i++) {
                a++;
            }
        });
        thread.start();
        //主线程中也执行+10亿的操作
        long b = 0;
        for (int i = 0; i < COUNT; i++) {
            b++;
        }
        // 等待子线程执行结束，主线程和子线程的加法操作都完成了
        // 因为走到这里的时候，主线程肯定已经走完了，但子线程不一定
        thread.join();//等待子线程thread执行结束才能执行下面代码
        long end = System.nanoTime();
        double allTime = (end - start) * 1.0 / 1000 / 1000;
        System.out.println("并发执行共耗时：" + allTime + "ms");
    }
}
