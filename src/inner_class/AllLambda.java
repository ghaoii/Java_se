package inner_class;

public class AllLambda {
    public static void main(String[] args) {
        //第一种情况，无返回值无参数
         NoParaNoReturn doubleNo = () -> System.out.println("无返回值，无参数的接口对象");
         doubleNo.test();
         //第二种情况，无返回值有参数
        HasParaNoReturn hasParaNoReturn = x -> {
            x += 20;
            System.out.println(x);
        };
        hasParaNoReturn.test(10);

        //第三种情况，有返回值无参数
//        NoParaHasReturn noParaHasReturn = () -> {
//            int a = 10;
//            int b = 20;
//            return a + b;
//        };
//        System.out.println(noParaHasReturn.test());

        //第三种情况，有返回值无参数
        NoParaHasReturn noParaHasReturn = () -> 10 + 20;
        System.out.println(noParaHasReturn.test());// 30

        //第四种方法，有返回值有参数
        hasParaHasReturn hasParaHasReturn = (x, y) -> x += y;// 这里使用+=是因为这样有返回值
        System.out.println(hasParaHasReturn.test(10, 20));// 30
    }
}

interface NoParaNoReturn {
    void test();
}

interface NoParaHasReturn {
    int test();
}

interface HasParaNoReturn {
    void test(int a);
}

interface hasParaHasReturn {
    int test(int a, int b);
}