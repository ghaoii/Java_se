package thread.single;

/**
 * 懒汉式单例 - 第一次调用getSingleTon方法才实例化对象
 */
public class LazySingleTon {
    private static volatile LazySingleTon lazySingleTon;
    private LazySingleTon() {
        int x = 10;
        int y = 20;
        int z = 30;
    }
    public synchronized static LazySingleTon getLazySingleTon() {
        if(lazySingleTon == null) {
            // 进入该方法之后，同步代码块是互斥的
            // 能保证同一时间只有一个线程能够创建新的对象，但仍然不能保证线程安全
            // 多个线程并行进入if，第一个线程执行完同步代码块之后，其他线程恢复执行，继续创建新的对象
            synchronized (LazySingleTon.class) {
                // 这里在判断一次唯一对象是否为空，就能保证对象的唯一性，称为double-check
                if(lazySingleTon == null) {
                    lazySingleTon = new LazySingleTon();
                }
            }
        }
        return lazySingleTon;
    }
}
