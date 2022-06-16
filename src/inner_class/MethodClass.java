package inner_class;

public class MethodClass {
    public static void main(String[] args) {
        fun(20);
    }

    public static void fun(int num) {
        int i = 10;
        class Inner {
            void test() {
                System.out.println(i);
            }
        }
        //i++;// error
        num += 20;// OK
        Inner in = new Inner();
        in.test();
    }
}
