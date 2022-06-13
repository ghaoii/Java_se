package inner_class;

public class Outter {
    private String msg = "Outter中的msg属性";
    private static int age = 0;
    public void fun() {
        Inner inner = new Inner();//产生内部类的对象
        //inner.fun();//调用内部类的方法
        System.out.println("outter的fun方法");
        System.out.println(inner.innerMsg);//通过内部类的对象访问私有属性
    }

    class Inner {
        private String innerMsg = "Inner中的msg属性";
        public void fun() {
            //访问内部类的innerMsg属性
            System.out.println(innerMsg);
            System.out.println(msg);//直接访问外部类的私有属性
            System.out.println("inner中的fun方法");
            Outter.this.fun();
        }
    }

    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.fun();
    }
}
