package book_management;

import book_management.book.BookList;
import book_management.user.AdminUser;
import book_management.user.NormalUser;
import book_management.user.User;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.产生一个书架
        BookList bookList = new BookList();
        //2.用户登陆操作
        User user = login();
        while(true){
            int choice = user.menu();
            if(choice == -1){
                System.out.println("系统退出");
                return;
            }else{
                user.doOperation(bookList, choice);
            }
        }
    }

    private static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入用户类型：1.普通用户 2.管理员");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new NormalUser(userName);
        }else if(choice == 2){
            return new AdminUser(userName);
        }
        throw new NoSuchElementException("输入有误，没有该选项");
    }


}
