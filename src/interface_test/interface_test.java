package interface_test;

class Person{
    protected String name = "hello";
    public void fun(){
        this.test();
    }
    public Person test(){
        System.out.println("1.Person的test方法");
        return new Person();
    }
}

class Student extends Person{
    String name = "hi";
    public Student test(){
        System.out.println("2.Student的test方法");
        return new Student();
    }
    public void fun(){
        System.out.println(name);
        Person person = new Person();
        System.out.println(person.name);
    }
}

public class interface_test {
    public static void main(String[] args) {
        Student student = new Student();
        student.fun();
    }
}
