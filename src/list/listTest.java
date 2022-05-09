package list;

import java.util.ArrayList;
import java.util.List;

public class listTest {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(30);
//        list.add(50);
//        list.add(70);
//        list.add(2, 40);
//        System.out.println(list);
//        System.out.println(list.get(1));
//        System.out.println(list.set(3, 500));
//    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list.add(list1);
        list.add(list2);
        System.out.println(list);
    }
}
