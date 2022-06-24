package thread.safe;

public class Reentrant {
    private static class Counter {
        int val;

        // 该方法没加上synchronized关键字，因此所有线程都可以并发进入increase4方法
        void increase3() {
            System.out.println(Thread.currentThread().getName() + "说val = " + val);
            System.out.println(Thread.currentThread().getName() + "说：Taylor的演唱会开始了~");
            // 同步代码块，进入同步代码块就必须获取到执行的锁
            // this表示当前对象引用，锁的是当前对象
            // 若锁的是class对象，全局唯一
            synchronized(Reentrant.class) {
                while(true) {
                    System.out.println(Thread.currentThread().getName() + "获取到了当前对象的锁");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        synchronized static void increase2() {
            while(true) {
                System.out.println(Thread.currentThread().getName() + "获取到了锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // 锁的是当前Counter对象
        synchronized void increase() {
            System.out.println(Thread.currentThread().getName() + "val正在累加");
            val++;
        }
        // 锁的也是当前Counter对象
        synchronized void increase1() {
            // 就相当于同一个Counter对象加了两次锁
            // 若线程1进入了increase1，若不支持可重入，那么进入increase需要再次获取锁，无法进入increase
            // 因此拿到当前Counter对象锁的线程阻塞在这里，等待自己释放锁之后在进入increase()
            // 最终导致该线程一直阻塞在这里，这就是死锁
            increase();
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Thread t1 = new Thread(() -> {
           counter1.increase3();
        }, "t1");
        Thread t2 = new Thread(() -> {
            counter2.increase3();
        }, "t2");
        Thread t3 = new Thread(() -> {
            counter3.increase3();
        }, "t3");
        t1.start();
        t2.start();
        t3.start();

//        Counter counter1 = new Counter();
//        Thread t1 = new Thread(() -> {
//            counter1.increase();;
//        }, "t1");
//
//        Counter counter2 = new Counter();
//        Thread t2 = new Thread(() -> {
//            counter2.increase();
//        });
    }
}
