package interface_test.animal;

public class Dog implements IRun,ISwim{
    @Override
    public void run() {
        System.out.println("A dog is running ...");
    }

    @Override
    public void swim() {
        System.out.println("A dog is swimming ...");
    }
}
