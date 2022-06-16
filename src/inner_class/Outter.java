package inner_class;

public class Outter {
    private String msg = "Outter中的msg属性";
    private static int age = 0;
    public void fun() {
        Inner inner = new Inner();//产生内部类的对象
        inner.fun();//调用内部类的方法
    }

    class Inner {
        private String innerMsg = "Inner中的msg属性";
        public void fun() {
            System.out.println(Outter.this);
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        Outter outter = new Outter();
        System.out.println(outter);
        outter.fun();
    }
}
