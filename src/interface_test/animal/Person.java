package interface_test.animal;

public class Person implements IRun {
    @Override
    public void run() {
        System.out.println("A person is running ...");
    }
}
