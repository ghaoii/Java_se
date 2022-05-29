package generic_test;

/**
 * 子类在实现接口时，如果子类也不知道具体的类型，就继续保留泛型
 * @param <T>
 */
public class MessageImpl1<T> implements IMessage<T>{
    private T msg;
    @Override
    public void print(T t) {
        System.out.println(t);
    }

    @Override
    public T getMsg() {
        return msg;
    }

    @Override
    public void setMSg(T t) {
        this.msg = t;
    }
}
