package inner_class;

public interface NewInterface {
    //抽象方法
    void test();

    //普通方法
    default void test1() {
        System.out.println("接口中的普通方法");
    }

    class InterFaceImpl implements NewInterface {
        @Override
        public void test() {
            System.out.println("覆写接口中的抽象方法");
        }
        //这里即使不覆写test1方法也没问题
    }

    public static void main(String[] args) {
        InterFaceImpl interFace = new InterFaceImpl();
        interFace.test1();// OK
    }
}
