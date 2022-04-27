package animal;

public class D extends B{
    public D(){
        System.out.println("4.D的构造方法-----------");
    }
    {
        System.out.println("5.D的构造块-------------");
    }
    static{
        System.out.println("6.D的静态代码块----------");
    }

    public static void main(String[] args) {
        System.out.println("7.main开始-------------");
        new D();
        new D();
        System.out.println("8.main结束-------------");
    }
}
