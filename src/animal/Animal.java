package animal;

public class Animal {
    protected String name = "测试name";//当前类和其子类是可见的，没有继承关系且不在同个包的的类之间不可见
    private int age;//只在当前类的内部可见，子类虽然继承了，但是无法直接使用

    static String test = "hello";

    public Animal(){
        System.out.println("Animal的无参构造");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}

