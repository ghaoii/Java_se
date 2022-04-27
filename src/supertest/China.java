package supertest;

public class China extends Person{
    public String name = "china";

    public China(){
        super("父类");
        System.out.println("China的无参构造");
    }

//    public China(String name){
//        //super("父类");error
//        this();
//        this.name = name;
//        System.out.println("China的有参构造");
//    }



    public void fun(){
//        在访问成员变量的时候，建议写上this，尤其是有继承的时候，不容易混淆
        System.out.println("China的普通方法");
    }

    public void test(){
        super.fun();
        System.out.println(this);
        //System.out.println(super);//error
        super.toString();

    }

    public static void main(String[] args) {
        China china = new China();
        china.test();
    }
}
