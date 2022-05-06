package object_test;

public class Person implements Comparable{
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof Person){
            Person per = (Person) o;
            return this.age - per.age;
//            return per.age - this.age;
        }
        throw new IllegalArgumentException("不是Person类型，无法比较!");
    }

    private String name = "person";
    private int age = 18;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            return this.name.equals(((Person) obj).name) && this.age == ((Person) obj).age;
        }
        //obj不是Person的对象，那么根本就无法比较
        return false;
    }

    @Override
    public String toString() {
        return "name = " + this.name + ", age = " + this.age;
    }
}
