package book_management.operation;

import book_management.book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner scanner = new Scanner(System.in);

    //在指定的书架上进行操作处理
    void work(BookList bookList);

}
