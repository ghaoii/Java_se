package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您想要归还的书籍");
        String name = scanner.nextLine();
        if(bookList.isExist(name)){
            bookList.returnBook(name);
        }else{
            System.out.println("很抱歉，图书馆目前没有该书籍!");
            System.out.println("请检查您输入的书名是否正确!");
        }
    }
}
