package string_test;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        //sb.reverse();
        //sb.delete(5,10);//左闭右开区间
        sb.insert(5, 10);
        sb.delete(5,7);
        String str = sb.toString();
        System.out.println(str);

    }
}
