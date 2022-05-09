package book_management.user;

import book_management.book.BookList;
import book_management.operation.IOperation;

public abstract class User {

    protected  String name;//无论是什么用户都要有姓名

    //数组里存的是接口的子类
    //不同的用户有不同的权限，但是现在不知道用户类型，所以是空数组，由子类来确定到底具备哪些权限
    protected IOperation[] operations;

    public User(String name){
        this.name = name;
    }

    //菜单，不同的用户类型的菜单是不同的，根据菜单的返回值来取得用户选择的操作
    public abstract int menu();

    //根据用户输入的指令来执行不同的操作
    public void doOperation(BookList bookList, int choice){
        //为了让不同的choice反应出不同的行为，那么该数组里存储的就是方法的实现
        //而IOperation是接口，只能有全局变量和抽象方法，所以数组里存放的是接口的子类
        operations[choice - 1].work(bookList);
    }
}
