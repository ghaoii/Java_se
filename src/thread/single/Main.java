package thread.single;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            LazySingleTon s1 = LazySingleTon.getLazySingleTon();
            System.out.println(s1);
        });
        Thread t2 = new Thread(() -> {
            LazySingleTon s2 = LazySingleTon.getLazySingleTon();
            System.out.println(s2);
        });
        Thread t3 = new Thread(() -> {
            LazySingleTon s3 = LazySingleTon.getLazySingleTon();
            System.out.println(s3);
        });
        t1.start();
        t2.start();
        t3.start();

//        SingleTon s1 = SingleTon.getSingleTon();
//        SingleTon s2 = SingleTon.getSingleTon();
//        SingleTon s3 = SingleTon.getSingleTon();
//        System.out.println(s1 == s2);// true
//        System.out.println(s1 == s3);// true
    }
}
