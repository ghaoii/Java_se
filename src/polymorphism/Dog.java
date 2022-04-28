package polymorphism;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog 的eat方法");
    }

    public void play(){
        System.out.println("Dog is playing");
    }

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = (Dog) animal;
//        dog.play();

        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        if(animal1 instanceof Dog){
            Dog dog = (Dog) animal1;
            System.out.println("animal1转型成功");
        }else{
            System.out.println("animal1不是指向Dog类型的引用");
        }
        if(animal2 instanceof Dog){
            Dog dog = (Dog) animal2;
            System.out.println("animal2转型成功");
        }else{
            System.out.println("animal1不是指向Dog类型的引用");
        }
    }

}
