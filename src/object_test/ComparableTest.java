package object_test;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        Person[] person = new Person[]{
                new Person("per1", 18),
                new Person("per2", 10),
                new Person("per3", 30)
        };

        sort(person);

        System.out.println(Arrays.toString(person));
    }

    public static void sort(Comparable[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            boolean swaped = true;
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j].compareTo(x[j + 1]) > 0) {
                    Comparable tmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = tmp;
                    swaped = false;
                }
            }
            if (swaped) {
                break;
            }
        }
    }
}
