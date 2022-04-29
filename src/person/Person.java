package person;

import animal.Animal;

public class Person extends Animal {

    public Person(){
        System.out.println("Person的无参构造");
    }

    public void fun(){
        System.out.println(name);
        //System.out.println(age);error
    }

    protected void show(){
        System.out.println(name);
    }
}

