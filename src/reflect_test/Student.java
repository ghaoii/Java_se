package reflect_test;

public class Student extends Person {
    private String name;
    public int age;
    String sex;

    public static String country = "China";

    public static void test(){
        System.out.println("Student类的静态方法");
    }

    public void fun(String msg){
        //System.out.println(this.name + "Student类的普通方法");
        System.out.println(msg);
    }

    public Student() {
        System.out.println("Student类的无参构造");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    private Student(String name) {
        this.name = name;
        System.out.println("Student类的name构造");
    }

    Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Student类的三个参数的有参方法");
    }
}

class Person{}