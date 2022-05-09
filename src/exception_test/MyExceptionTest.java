package exception_test;

import java.util.Scanner;

public class MyExceptionTest {
    private static final String USER_NAME = "test";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        if(!USER_NAME.equals(userName)){
            throw new UserNameException("用户名错误!");
        }
        if(!PASSWORD.equals(password)){
            throw new PassWordException("密码输入错误!");
        }
    }
}

class UserNameException extends RuntimeException{
    public UserNameException(String message) {
        super(message);
    }
}

class PassWordException extends RuntimeException{
    public PassWordException(String message) {
        super(message);
    }
}
