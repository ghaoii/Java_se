package thread.state;

public class YieldTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
           while(true) {
               System.out.println(Thread.currentThread().getName());
               // 调用该方法之后，t1线程就会让出CPU，进入就绪态，等待被CPU继续调度
               Thread.yield();
           }
        }, "111111111111111111111");
        Thread t2 = new Thread(() -> {
           while(true) {
               System.out.println(Thread.currentThread().getName());
           }
        }, "222222222");
        t1.start();
        t2.start();
    }
}
