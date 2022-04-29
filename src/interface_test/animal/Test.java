package interface_test.animal;

import animal.D;

public class Test {
    public static void main(String[] args) {
//        IRun run1 = new Person();
//        IRun run2 = new Dog();
//        ISwim swim = new Dog();
        IFly fly = new Duck();
//        run1.run();
//        run2.run();
//        swim.swim();
        fly.fly();
    }
}
