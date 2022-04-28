package polymorphism;

public class D extends B{
    private int num = 10;

    public void fun(){
        System.out.println("D的fun方法, num = " + num);
    }

    public static void main(String[] args) {
        D d = new D();
    }

}
