package inner_class;

import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class NoNameClass {
    public static void main(String[] args) {
        // 匿名内部类实现了IMessage接口
        // 接口无法直接实例化对象的，因此我们此处其实new的是IMessage接口的子类
        // 只不过这个子类只在fun方法中使用一次而已
        fun(new IMessage() {
            // 覆写IMessage里的抽象方法
            @Override
            public void getMsg(String msg) {
                System.out.println(msg);// 测试匿名内部类
            }
        });

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public static void fun(IMessage message) {
        message.getMsg("测试匿名内部类");
    }

}

interface IMessage {
    void getMsg(String msg);
}
