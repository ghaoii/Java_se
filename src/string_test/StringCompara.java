package string_test;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class StringCompara {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String str1 = "abc";
//        String str2 = "Abc";
//        System.out.println(str1.compareTo(str2));

//        char[] ch = {'a', 'b', 'c'};
//        //String str = new String(ch);
//        String str = new String(ch,1, 2);
//        System.out.println(str);

//        String str = "hello";
//        char[] data = str.toCharArray();
//        System.out.println(data);
//        System.out.println(str.charAt(1));

//        String str1 = "123";
//        String str2 = "123a";
//        String str3 = null;
//        System.out.println(isAllNum(str1));
//        System.out.println(isAllNum(str2));
//        System.out.println(isAllNum(str3));

//        byte[] data = {97, 98, 99};
//        String str = new String(data);
//        System.out.println(str);

//        String str = "你好中国";
//        byte[] data = str.getBytes("gbk");
//        System.out.println(Arrays.toString(data));

//        String str = "hello world";
//        System.out.println(str.contains("hello"));
//        System.out.println(str.startsWith("hello"));
//        System.out.println(str.startsWith("hello1"));
//        System.out.println(str.endsWith("world"));
//        System.out.println(str.endsWith("world1"));

//        String str = "hello world";
//        System.out.println(str.replaceAll("l", "_"));
//        System.out.println(str.replaceAll("ll", "_"));
//        System.out.println(str.replaceFirst("l", "_"));
//        System.out.println(str);


//        String str = "Hello Java Hello World";
//        String[] data1 = str.split(" ");
//        String[] data2 = str.split(" ", 2);
//        System.out.println(Arrays.toString(data1));
//        System.out.println(Arrays.toString(data2));

        String str = "192.168.1.1";
        String[] data1 = str.split(".");
        String[] data2 = str.split("～");
        System.out.println(Arrays.toString(data1));
        System.out.println(data2.length);
        System.out.println(Arrays.toString(data2));

//        String str = "helloworld";
//        System.out.println(str.substring(5));
//        System.out.println(str.substring(0, 5));

//        String str = " hello world ";
//        System.out.println(str.trim());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.length());
//        System.out.println();

//        String str = "";
//        if(str != null){
//            System.out.println(str.isEmpty());
//        }

//        String str1 = "hello world";
//        String str2 = "h";
//        String str3 = "";
//        System.out.println(firUpper(str1));
//        System.out.println(firUpper(str2));
//        System.out.println(firUpper(str3));

    }

    public static String firUpper(String str){
        //判空
        if(str == null || str.isEmpty()){
            return null;
        }
        //如果字符串中只有一个字符
        if(str.length() == 1){
            return str.toUpperCase();
        }
        //此时字符串长度大于1
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static boolean isAllNum(String str){
        //如果传入一个空指针
        if(str == null){
            return false;
        }
        //如果不是空指针，转化为字符数组
        char[] arr = str.toCharArray();
        for(char ch : arr){
//            if(ch < '0' || ch > '9'){
//                //找到反例，直接返回
//                return false;
//            }
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

}
