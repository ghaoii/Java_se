package generic_test;

public class Point {
    private Object x;
    private Object y;

    public void setX(Object x) {
        this.x = x;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public Object getX() {
        return x;
    }

    public Object getY() {
        return y;
    }

    public static void main(String[] args) {

//        Point point1 = new Point();
//        point1.setX(10);
//        point1.setY(20);
//        int x = (int) point1.getX();
//        int y = (int) point1.getY();
//        System.out.println("x = " + x + ", y = " + y);// x = 10, y = 20

//        point1.setX("hello");
//        point1.setY("world");
//        String a = (String) point1.getX();
//        String b = (String) point1.getY();
//        System.out.println("a = " + a + ", b = " + b);

        Point point = new Point();
        point.setX(10);
        point.setY("hello");
        String x = (String) point.getX();
        String y = (String) point.getY();
        System.out.println("x = " + x + ", y = " + y);
    }

}
