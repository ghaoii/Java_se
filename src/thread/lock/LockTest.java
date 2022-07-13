package thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {
           lock.lock();// 代码从这里开始加锁，直到碰到unlock解锁
           // 互斥代码块
           try {
               System.out.println("我是" + Thread.currentThread().getName() + "线程");
               Thread.sleep(8000);
           }catch (InterruptedException e) {
               e.printStackTrace();
           }finally {
               lock.unlock();
           }
            System.out.println(Thread.currentThread().getName() + "释放锁");
        }, "t1");
        t1.start();
        Thread t2 = new Thread(() -> {
            boolean isLocked = false;
            try {
                 isLocked = lock.tryLock(3000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                if(isLocked) {
                    // 只有获取锁成功的线程才需要执行unlock方法
                    lock.unlock();
                }
            }
            System.out.println("t1, 我等不到你了, 有缘再见");
//            lock.lock();
//            try {
//                System.out.println("我是" + Thread.currentThread().getName() + "线程");
//            }finally {
//                lock.unlock();
//            }
        }, "t2");
        t2.start();
    }
}
