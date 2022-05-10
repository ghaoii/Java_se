package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您想要查询的书籍");
        String name = scanner.nextLine();
        if(bookList.isExist(name)){
            bookList.findBook(name);
        }else{
            System.out.println("很抱歉，目前图书馆没有上架该书籍");
        }
    }
}
