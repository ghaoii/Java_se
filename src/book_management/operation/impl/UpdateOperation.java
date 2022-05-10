package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class UpdateOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您想要更新的书籍名称");
        String name = scanner.nextLine();
        if(bookList.isExist(name)){
            bookList.updateBook(name);
        }else{
            System.out.println("目前还有没有该书籍!");
            System.out.println("请检查您输入的书名是否正确!");
        }
    }
}
