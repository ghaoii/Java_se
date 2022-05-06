package object_test;

public class CloneableTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal("dog", 1);
        //Animal animal2 = new Animal("cat", 3);
        Animal animal3 = animal1.clone();

        System.out.println(animal1 == animal3);//false,说明地址确实是不同的
        System.out.println(animal3.name);//dog,说明确实是拷贝了animal1
    }
}

class Animal implements Cloneable{
    String name;
    int age;

    {
        System.out.println("Animal 的构造方法");
    }

    public Animal clone(){
        Animal newAnimal = null;
        try {
            newAnimal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return newAnimal;
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
