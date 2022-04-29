package interface_test.sharp;

public class Test {

    public static void main(String[] args) {
        fun(new Cycle());
        fun(new Square());
        fun(new Triangle());
    }

    public static void fun(Sharp sharp){
        sharp.print();
    }
}
