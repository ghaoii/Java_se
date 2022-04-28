package supertest;

public class Animal {

    private void test(){
        System.out.println("test是私有方法");
    }

    public void fun(){
        test();
    }

    public Animal(){
        System.out.println("Animal的无参构造");
    }
    protected String name = "animal";
}
