package book_management.user;

import book_management.book.BookList;
import book_management.operation.IOperation;
import book_management.operation.impl.BorrowOperation;
import book_management.operation.impl.FindOperation;
import book_management.operation.impl.ListAllBookOperation;
import book_management.operation.impl.ReturnOperation;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name){
        super(name);
        this.operations = new IOperation[] {
                new ListAllBookOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    @Override
    public int menu() {
        System.out.println("=================================");
        System.out.println("欢迎" + this.name + "登陆图书管理系统");
        System.out.println("1.显示当前的书籍列表");
        System.out.println("2.查找书籍");
        System.out.println("3.借阅书籍");
        System.out.println("4.归还书籍");
        System.out.println("-1.退出系统");
        System.out.println("=================================");
        System.out.println("请输入您的选择:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void doOperation(BookList bookList, int choice) {
        super.doOperation(bookList, choice);
    }
}
