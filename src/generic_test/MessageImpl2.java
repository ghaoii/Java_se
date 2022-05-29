package generic_test;

public class MessageImpl2 implements IMessage<String>{
    @Override
    public String getMsg() {
        return null;
    }

    @Override
    public void setMSg(String s) {

    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
