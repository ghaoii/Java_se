package thread;

/**
 * 这个实现了Runnable接口的子类，并不是直接的线程对象，只是一个线程的核心工作任务
 * 这是线程任务和线程实体的关系
 */
public class RunnableMethod implements Runnable {
    @Override
    public void run() {
        System.out.println("这是Runnable方式实现的子线程任务");
    }
}
