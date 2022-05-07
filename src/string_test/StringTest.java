package string_test;

public class StringTest {
    public static void main(String[] args) {
//        //第一种创建方法
//        String str1 = "hello";
//        //第二种创建方式
//        String str2 = new String("world");
//        //第三种创建方式
//        char[] data = new char[] { 'a', 'b', 'c'};
//        String str3 = new String(data);
//        //第四种创建方式
//        String str4 = String.valueOf(8);
//        System.out.println(str1 + str2 + str3 + str4);

//        String str1 = "hello";
//        String str2 = "hello";
//        String str3 = "hello";

//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = new String("hello");
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        System.out.println(str1 + str2 + str3);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equalsIgnoreCase(str3));

//        String str1 = "hello";
//        String str2 = "Hello";
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));

        //如果牵扯到用户输入，最好是用字符串调用equals方法，因为字符串是必然存在的对象，不会空指针
//        String userName = null;
//        System.out.println(userName.equals("person"));
//        System.out.println("person".equals(userName));


        //手工入池
//        String str1 = new String("hello");
//        str1.intern();
//        String str2 = "hello";
//        System.out.println(str1 == str2);

//        char[] data = new char[] { 'a', 'b', 'c'};
//        String str1 = new String(data);
//        str1.intern();
//        String str2 = "abc";
//        System.out.println(str1 == str2);

//        String str1 = "hello";
//        String str2 = str1;
//        str2 = "Hello";
//        System.out.println(str1);

//        String str = "hello";
//        str = str + "world";
//        System.out.println(str);

        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6

    }
}
