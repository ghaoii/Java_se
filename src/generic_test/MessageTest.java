package generic_test;

import javax.swing.*;

public class MessageTest {
//    public static void main(String[] args) {
//        MessageImpl1<String> msg = new MessageImpl1<>();
//        msg.print("123");
//        IMessage<Integer> msg1 = new MessageImpl1<>();
//        msg1.print(123);
//        IMessage<String> msg2 = new MessageImpl1<>();
//        msg2.print("456");
//        IMessage<String> msg3 = new MessageImpl1<>();
//        msg3.print(345);
//    }

//    public static void main(String[] args) {
//        IMessage<String> msg = new MessageImpl1<>();
//        fun(msg);
//        IMessage<Integer> msg2 = new MessageImpl1<>();
//        fun(msg2);
//    }

//    public static void main(String[] args) {
//        IMessage<String> msg1 = new MessageImpl1<>();
//        msg1.setMSg("How are you?");
//        IMessage<Integer> msg2 = new MessageImpl1<>();
//        msg2.setMSg(111);
//        fun(msg1);
//        fun(msg2);
//    }

//    public static void main(String[] args) {
//        IMessage<Integer> msg = new MessageImpl1<>();
//        msg.setMSg(123);
//        fun2(msg);// 123
//        IMessage<Double> msg1 = new MessageImpl1<>();
//        msg1.setMSg(5.5);
//        fun2(msg1);// 5.5
//        IMessage<String> msg2 = new MessageImpl1<>();
//        msg2.setMSg("Hello");
//        fun2(msg2);//编译失败
//    }

    public static void main(String[] args) {
        IMessage<String> msg1 = new MessageImpl1<>();
        msg1.setMSg("Harley");
        fun3(msg1);
        IMessage<Integer> msg2 = new MessageImpl1<>();
        msg2.setMSg(18);
        //fun3(msg2);//error

    }

    //此时的fun3只能接收String及其父类的IMessage对象
    public static void fun3(IMessage<? super String> msg){
        System.out.println(msg.getMsg());// Harley
        msg.setMSg("Joseph");
        System.out.println(msg.getMsg());// Joseph
    }

    //这里的msg仍然能够接收不同的类型，但是必须是Number及其子类
    public static void fun2(IMessage<? extends Number> msg){
        System.out.println(msg.getMsg());
    }

    public static void fun(IMessage<?> msg){
        System.out.println(msg.getMsg());
    }

//    public static void fun(IMessage<? super String> msg){
//        System.out.println(msg);
//    }
}
