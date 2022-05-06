package object_test;

public class DeepTest {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = b1.clone();
        System.out.println(b1 == b2);// false
        System.out.println(b1.a == b2.a);// true
    }
}

class A implements Cloneable{
    int num;
    public A clone(){
        A newA = null;
        try {
            newA = (A) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return newA;
    }
}

class B implements Cloneable {
    A a = new A();

    public B clone(){
        B newB  = null;
        try {
            newB = (B) super.clone();
            newB.a = newB.a.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return newB;
    }
}


