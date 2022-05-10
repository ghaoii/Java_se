package book_management.operation.impl;

import book_management.book.Book;
import book_management.book.BookList;
import book_management.operation.IOperation;

public class ListAllBookOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        bookList.listBooks();
    }
}
