package object_test;


import java.util.Arrays;

interface ITest{
    void test();
}

class TestImpl implements ITest{
    @Override
    public void test() {
        System.out.println("hehe");
    }
}

public class ObjectTest {
    public static void main(String[] args) {

        ITest i1 = new TestImpl();
        int[] data = new int[10];

        Object obj1 = i1;
        Object obj2 = data;


//        Object obj = "hello";
//        Person per1 = new Person("hello", 18);
//        Person per2 = new Person("hi", 28);
//        Person per3 = new Person("hi", 28);
//
//        System.out.println(per2.equals(per3));
//        System.out.println(per1.equals(per2));


//        Person[] person = new Person[] {
//                new Person("per1", 18),
//                new Person("per2", 10),
//                new Person("per3", 30)
//        };
//
//        sort(person);
//
//        System.out.println(Arrays.toString(person));

    }

    public static void sort(Comparable[] x){
        for (int i = 0; i < x.length - 1; i++) {
            boolean swaped = true;
            for (int j = 0; j < x.length - i - 1; j++) {
                if(x[j].compareTo(x[j + 1]) > 0){
                    Comparable tmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = tmp;
                    swaped = false;
                }
            }
            if(swaped){
                break;
            }
        }
    }
}
