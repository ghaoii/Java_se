package generic_test;

public class MyPointNew<T, E> {
    private T x;
    private E y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(E y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public E getY() {
        return y;
    }

    public static void main(String[] args) {
        MyPointNew<String, String> pointNew = new MyPointNew<>();
        pointNew.setX("hello");
        pointNew.setY("world");
        String x = pointNew.getX();
        String y = pointNew.getY();
        System.out.println("x = " + x + ", y = " + y);// x = hello, y = world
    }

}
