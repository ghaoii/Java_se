package thread.single;

public class SingleTon {
    // 唯一的对象
    private static SingleTon singleTon = new SingleTon();
    private SingleTon() {}

    public static SingleTon getSingleTon() {
        return singleTon;
    }
}
