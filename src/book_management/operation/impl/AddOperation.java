package book_management.operation.impl;

import book_management.book.BookList;
import book_management.operation.IOperation;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您想想要添加的书籍名称");
        String name = scanner.nextLine();
        if(bookList.isExist(name)){
            System.out.println("书本已存在，请勿重复添加");
            return;
        }
        System.out.println("请输入待添加书籍的作者名字");
        String author = scanner.nextLine();
        System.out.println("请输入待添加书籍的价格");
        double price = scanner.nextDouble();
        System.out.println("请输入待添加书籍的类型");
        String type = scanner.nextLine();

        bookList.addNewBook(name, author, price, type);
    }
}
