package thread;

public class ThreadInterruptedByMethod {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            //静态方法，判断当前线程是否被中断了
            while(!Thread.interrupted()) {
                System.out.println(Thread.currentThread().getName() + "进行中！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //当线程被中断时，会抛出中断异常
                    //线程抛出中断异常之后，中断状态就会还原，这也是为什么我们在这里要调用break的原因
                    System.err.println("ED突然闯入说他也想高歌一曲");
                    break;
                }
            }
            //成员方法，判断当前线程对象是否被中断
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + "进行中！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //当线程被中断时，会抛出中断异常
                    System.err.println("ED突然闯入说他也想高歌一曲");
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + "变成了ED和Taylor的二对一演唱会，芜湖～");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable mt = new MyRunnable();
        Thread thread = new Thread(mt, "Taylor的私人演唱会");
        System.out.println("今天是个开心的日子，Dua的私人演唱会要开始了～～");
        System.out.println("哇哦，演唱会开始了，芜湖～");
        thread.start();
        Thread.sleep(5000);
        //ED的突然闯入中断了演唱会
        thread.interrupt();
    }
}
