package thread;

/**
 * 继承Thread类创建线程
 * ThreadMethod这个子类就是一个线程实体
 */
public class ThreadMethod extends Thread{
    @Override
    public void run() {
        System.out.println("这是子线程的的输出结果");
    }
}
