package book_management.user;

import book_management.book.BookList;
import book_management.operation.IOperation;
import book_management.operation.impl.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                new ListAllBookOperation(),
                new AddOperation(),
                new RemoveOperation(),
                new UpdateOperation(),
                new FindOperation()
        };
    }



    @Override
    public void doOperation(BookList bookList, int choice) {
        super.doOperation(bookList, choice);
    }

    @Override
    public int menu() {
        System.out.println("=================================");
        System.out.println("欢迎" + this.name + "登陆图书管理系统");
        System.out.println("1.显示当前的书籍列表");
        System.out.println("2.增加书籍");
        System.out.println("3.下架书籍");
        System.out.println("4.更新书籍");
        System.out.println("5.查找书籍");
        System.out.println("-1.退出系统");
        System.out.println("=================================");
        System.out.println("请输入您的选择:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
