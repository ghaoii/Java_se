package interface_test.sharp;

abstract class BaseTest{
    public BaseTest(){
        this.print();
    }
    abstract void print();
}

public class Fun extends BaseTest {
    private int num = 10;

    @Override
    void print() {
        System.out.println("num = " + num);
    }

    public static void main(String[] args) {
        new Fun();
    }
}
