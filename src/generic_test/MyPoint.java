package generic_test;

public class MyPoint<T> {
    //此时x的类型不确定，在产生这个属性的时候才确定类型
    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public static void main(String[] args) {
        //此时设置的类型假设为String
        MyPoint<String> point = new MyPoint<>();
        point.setX("hello");
        point.setY("world");
        String x = point.getX();
        String y = point.getY();
        System.out.println("x = " + x + ", y = " + y);
    }
}
