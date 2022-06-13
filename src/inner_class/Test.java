package inner_class;

public class Test {
    public static void main(String[] args) {
        //在Test中产生包访问权限的Inner对象
        Outter.Inner inner = new Outter().new Inner();
        inner.fun();
    }
}
