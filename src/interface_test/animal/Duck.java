package interface_test.animal;

public class Duck implements IRun,ISwim,IFly{
    @Override
    public void run() {
        System.out.println("A duck is running ...");
    }

    @Override
    public void swim() {
        System.out.println("A duck is swimming ...");
    }

    @Override
    public void fly() {
        System.out.println(IFly.show);
        System.out.println("A duck is flying ...");
    }
}
