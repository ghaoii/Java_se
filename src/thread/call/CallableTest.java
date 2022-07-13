package thread.call;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 1000; i++) {
                    sum += i;
                }
                return sum;
            }
        };
//        // 接收call方法的返回值使用FutureTask对象
//        FutureTask<Integer> futureTask = new FutureTask<>(callable);
//        // Thread类接收Callable接口必须通过FutureTas类传入
//        Thread t = new Thread(futureTask);
//        t.start();
//        // get方法会阻塞当前线程，直到call方法执行完毕，才恢复执行，因此不需要使用join方法
//        int ret = futureTask.get();

        ExecutorService pool = Executors.newFixedThreadPool(3);
        // Future接口就是搭配Callable接口使用的，用于接收Callable的返回值
        Future<Integer> ret = pool.submit(callable);
        System.out.println(ret.get());// 500500
    }
}
