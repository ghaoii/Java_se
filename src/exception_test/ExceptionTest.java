package exception_test;

public class ExceptionTest {
    public static void main(String[] args) {
//        int[] data = {1,2,3};
//        System.out.println(data[100]);
//        String str = null;
//        System.out.println(str.length());

//        int[] data = {1,2,3};
//        String str = null;
//        System.out.println("before...");
//        try{
//            System.out.println(str.length());
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组越界了~~");
//        }catch (NullPointerException e){
//            System.out.println("空指针异常");
//        }
//        finally{
//            System.out.println("after...");
//        }

//        int[] data = {1,2,3};
//        System.out.println("before...");
//        try{
//            System.out.println(data[100]);
//            System.out.println("try的代码块");
//        }catch (Exception e){
//            System.out.println("出现异常了~~");
//            e.printStackTrace();
//        } finally{
//            System.out.println("after...");
//        }
//        System.out.println("hello");

//        int ret = test();
//        System.out.println(ret);


//        fun();
//        System.out.println("after fun");

//        String str = null;
//        try{
//            System.out.println(str.length());
//            System.out.println("try 的代码块");
//        }catch (NullPointerException e){
//            System.out.println("空指针异常");
//            e.printStackTrace();
//        }finally {
//            System.out.println("finally的代码块");
//        }

        String str = null;
        try{
            System.out.println( str.length());
        }catch (NullPointerException e){
            System.out.println("空指针异常~~");
        }catch (RuntimeException e) {
            System.out.println("运行时异常");
        }catch (Exception e){
            System.out.println("出现异常");
        }finally{
            System.out.println("finally代码块");
        }



}

    public static void fun() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
        System.out.println("异常了~~");
        //throw new NullPointerException("没什么，就是想抛个异常~~");
    }

    public static int test() throws ArithmeticException {
        try {
            int[] data = {1, 2, 3};
            data[100] = 10;
            return 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 20;
        } finally {
            System.out.println("finally的代码块");
            return 30;
        }
    }
}
