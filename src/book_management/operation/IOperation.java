package book_management.operation;

import book_management.book.BookList;

public interface IOperation {
    //在指定的书架上进行操作处理
    void work(BookList bookList);



}
