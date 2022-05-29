package reflect_test;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Test {
//    public static void main(String[] args) throws Exception{
//        //1.获取Student类的class对象
//        Class<Student> cls1 = (Class<Student>) Class.forName("reflect_test.Student");
//        //2.通过类名称.class获取class对象
//        Class<Student> cls2 = Student.class;
//        //3.通过Student对象的getClass方法
//        Class<Student> cls3 = (Class<Student>) new Student().getClass();
//        System.out.println(cls1 == cls2);
//        System.out.println(cls1 == cls3);
//    }

//    public static void main(String[] args) {
//        Person per = new Student();
//        System.out.println(per.getClass());
//    }

//    public static void main(String[] args) {
//        Class<Student> cls = Student.class;
//        //获取所有public权限的构造方法
//        Constructor[] constructors = cls.getConstructors();
//        for(Constructor constructor : constructors){
//            System.out.println(constructor);
//        }
//        System.out.println("----------------------------");
//        //获取该类的所有权限的构造方法
//        Constructor[] constructors1 = cls.getDeclaredConstructors();
//        for(Constructor constructor : constructors1){
//            System.out.println(constructor);
//        }
//    }

//    public static void main(String[] args) throws Exception{
//        Class<Student> cls = Student.class;
//        //获取指定类型的有参构造
//        Constructor<Student> constructor = cls.getDeclaredConstructor(String.class, int.class, String.class);
//        Student student = constructor.newInstance("Harley", 18, "Male");
//        System.out.println(student);//Student{name='Harley', age=18, sex='Male'}
//        System.out.println(constructor);// reflect_test.Student(java.lang.String,int,java.lang.String)
//    }

//    public static void main(String[] args) throws Exception{
//        Class<Student> cls = Student.class;
//        //获取private的构造方法
//        Constructor<Student> constructor = cls.getDeclaredConstructor(String.class);
//        //破坏封装，通过反射破坏private封装，调用私有构造
//        constructor.setAccessible(true);
//        Student student = constructor.newInstance("Harley");
//        System.out.println(student);// Student{name='Harley', age=0, sex='null'}
//    }

//    public static void main(String[] args) throws Exception{
//        Class<Student> cls = Student.class;
//        Method method1 = cls.getDeclaredMethod("test");
//        method1.invoke(null);// Student类的静态方法
//        //获取fun方法
//        Method method2 = cls.getDeclaredMethod("fun", String.class);
//        Student student = new Student("Harley", 18, "male");
//        //传入对象和方法需要的参数
//        method2.invoke(student, "Harley是我的英文名");
//        //执行结果
//        //HarleyStudent类的普通方法
//        //Harley是我的英文名
//    }

    public static void main(String[] args) throws Exception{
        Class<Student> cls = Student.class;
        //获取要拿到的属性Field对象
        Field field = cls.getDeclaredField("country");
        System.out.println(field.get(null));// China
        Field field1 = cls.getDeclaredField("age");
        Student student = new Student("Harley", 18, "male");
        System.out.println(field1.get(student));// 18
        field1.set(student, 20);
        System.out.println(field1.get(student));// 20
    }
}
