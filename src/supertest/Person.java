package supertest;

public class Person{
    protected String name = "person";

    public void fun(){
        System.out.println("Person的普通方法");
    }

    public Person(){

    }


    public String toString(){
        return "Person的toString方法";
    }

    public Person(String name){
        this.name = name;
        System.out.println(this.name + "Person的有参构造");
    }
}
