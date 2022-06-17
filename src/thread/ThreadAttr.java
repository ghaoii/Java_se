package thread;

public class ThreadAttr {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "I'm alive");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + "I'm going to die");
            }
        }, "TestThread");
        // --------------------------以下为主线程--------------------------------
        System.out.println(Thread.currentThread().getName() + "的ID: " + thread.getId());
        System.out.println("状态：" + Thread.currentThread().getState());
        System.out.println("优先级：" + Thread.currentThread().getPriority());
        System.out.println("后台线程与否？：" + Thread.currentThread().isDaemon());
        System.out.println("主线程存活与否？：" + Thread.currentThread().isAlive());
        System.out.println("子线程存活与否？：" + thread.isAlive());
        thread.start();
    }
}
