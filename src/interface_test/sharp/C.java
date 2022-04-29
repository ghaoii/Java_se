package interface_test.sharp;


abstract class A{
    abstract void printA();
}

abstract class B extends A {
    abstract void printB();
}

public class C extends B {
    @Override
    void printA() {}

    @Override
    void printB() {}
}
