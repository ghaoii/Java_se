package inner_class;

@FunctionalInterface
interface FunInterface {
    void test();
    //普通方法满足函数式接口的定义
    default void test1() {
        System.out.println("这是一个普通方法，不影响函数式接口的定义");
    }
    // void test2(); error
}

public class LambdaTest {
    public static void main(String[] args) {
        // 实参是由一个匿名内部类实现FunInterface接口的
        fun(new FunInterface() {
            // 3. 在匿名内部类中覆写test方法
            @Override
            public void test() {
                System.out.println("匿名内部类实现了FunInterface接口");// OK
            }
        });

        //fun的实参就是一个匿名内部类
        //箭头左边的圆括号()就是接口中定义的方法的参数，这里是无参方法，所以不需要参数
        //箭头则表示方法的实现
        fun(() -> {
            //test方法的方法体
            System.out.println("Lambda表达式实现了FunInterface接口");
        });
    }

    //接收FunInterface的对象fi
    public static void fun(FunInterface fi) {
        // 调用fi的test方法
        fi.test();
    }
}