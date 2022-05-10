package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入想要借阅的书籍名");
        String name = scanner.nextLine();
        if(!bookList.isExist(name)){
            System.out.println("很抱歉!图书馆目前没有上架这本书~~");
            return;
        }
        bookList.borrowBook(name);
    }
}
