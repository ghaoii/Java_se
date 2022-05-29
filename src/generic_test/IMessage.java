package generic_test;

public interface IMessage<T> {
    public void print(T t);
    T getMsg();
    void setMSg(T t);
}
