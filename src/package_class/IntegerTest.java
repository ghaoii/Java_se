package package_class;

public class IntegerTest {
    public static void main(String[] args) {
//        int val = 10;
//        //int -> Integer
//        Integer i1 = new Integer(val);
//        Object obj = i1;
//        System.out.println(obj);// 10
//        //如果需要进行数学运算，就需要把包装类对象还原为基本类型
//        int ret = i1.intValue();
//        ret += 10;
//        System.out.println(ret);// 20

//        Integer i1 = 10;
//        i1 += 10;
//        System.out.println(i1);


        Integer i1 = 130;
        Integer i2 = 130;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
