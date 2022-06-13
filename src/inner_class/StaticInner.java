package inner_class;

public class StaticInner {
    private static String staticMsg = "外部类的静态私有属性";
    private String msg = "外部类的成员私有属性";


    static class Inner {
        public void fun() {
            System.out.println(staticMsg);
            //System.out.println(msg);//error
            StaticInner staticInner = new StaticInner();
            System.out.println(staticInner.msg);//通过对象访问是可以的
        }
    }
}
