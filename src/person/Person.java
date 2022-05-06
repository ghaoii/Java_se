package person;

import animal.Animal;

public class Person extends Animal {
    String name = "111";
    public static void main(String[] args) {
        new Person().fun();
    }

    public Person(){
        System.out.println("Person的无参构造");
    }

    public void fun(){
        System.out.println(super.name);
        //System.out.println(age);error
    }

    protected void show(){
        System.out.println(name);
    }
}

