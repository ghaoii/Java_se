package generic_test;

import java.lang.reflect.Field;

public class MyClass<T, E extends Number> {
    private T msg;
    private E num;

    public <T> T test(T t){
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        MyClass<String, Integer> myClass = new MyClass<>();
        Class cls = myClass.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getType());
        }
    }
}
