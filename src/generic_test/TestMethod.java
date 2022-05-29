package generic_test;

public class TestMethod<T extends Number> {
    public void testMethod(T t){
        System.out.println(t);
    }

    public <E> E funMethod(E e){
        return e;
    }

    public static void main(String[] args) {
        TestMethod<Integer> cls = new TestMethod<>();
        cls.testMethod(2323);
        //TestMethod<String> cls1 = new TestMethod<>();error
        Integer a = cls.funMethod(123);
        Double b = cls.funMethod(5.5);
        System.out.println(a);
        System.out.println(b);
    }
}
