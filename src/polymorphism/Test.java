package polymorphism;


public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Teddy();
        Animal animal3 = new Cat();
        fun(animal1);
        fun(animal2);
        fun(animal3);
    }

    public static void fun(Animal animal){
        animal.eat();
    }

    public static Animal test(){
        Dog dog = new Dog();
        return dog;
    }
}
