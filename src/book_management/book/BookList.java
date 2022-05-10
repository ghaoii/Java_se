package book_management.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 书架
 * 书架应当保存有
 */

public class BookList {
    private List<Book> books = new ArrayList<>();
    public List<String> bookName = new ArrayList<>();


    public BookList(){
        //产生一个书架时，上面默认有4本书
        books.add(new Book("朝花夕拾", "鲁迅", 38.8, "散文集"));
        books.add(new Book("围城", "钱钟书", 36.0, "现代文学小说"));
        books.add(new Book("骆驼祥子", "老舍", 29.5, "长篇小说"));
        books.add(new Book("热爱生命", "Jack London", 28.8, "中篇小说"));
        //将当前四本书籍的名字也添加到bookName中
        bookName.add("朝花夕拾");
        bookName.add("围城");
        bookName.add("骆驼祥子");
        bookName.add("热爱生命");
    }

    public void addNewBook(String name, String author, double price, String type){
        books.add(new Book(name, author, price, type));
        bookName.add(name);
    }

    public void findBook(String name){
        Book book = books.get(bookName.indexOf(name));
        System.out.println("您好，这是您想要查询的书籍的信息：");
        System.out.println(book);
    }

    public void borrowBook(String name){
        int index = bookName.indexOf(name);
        Book book = books.get(index);
        if(book.isBorrowed()){
            System.out.println("很抱歉，该书籍已被借阅");
        }else{
            System.out.println("书籍借阅成功!");
            book.setBorrowed(true);
        }
    }

    public void returnBook(String name){
        Book book = books.get(bookName.indexOf(name));
        if(!book.isBorrowed()){
            System.out.println("该书还没有被借阅!");
            System.out.println("请检查您输入的书名是否正确!");
        }
        book.setBorrowed(false);
        System.out.println("书籍归还成功，感谢您的借阅!");
    }

    public void removeBook(String name){
        int index = bookName.indexOf(name);
        books.remove(index);
        bookName.remove(name);
        System.out.println("已将该书籍下架!");
    }

    public void updateBook(String name){
        while(true){
            System.out.println("请选择您想要更改的内容：");
            System.out.println("1.修改价格 2.修改书籍类型");
            Scanner scanner = new Scanner(System.in);
            int todo = scanner.nextInt();
            if(todo == 1){
                Book book = books.get(bookName.indexOf(name));
                System.out.println("请输入修正后的价格!");
                Double price = scanner.nextDouble();
                book.setPrice(price);
                System.out.println("价格已修正!");
                return;
            }else if(todo == 2){
                Book book = books.get(bookName.indexOf(name));
                System.out.println("请输入修正后的书籍类型");
                scanner.nextLine();
                String type = scanner.nextLine();//直接跳过输入?????
                book.setType(type);
                System.out.println("书籍类型已修正!");
                return;
            }else{
                System.out.println("选择错误，请重新选择");
            }
        }
    }


    public void listBooks() {
        for(Book book : books){
            System.out.println(book);
        }
    }

    public boolean isExist(String name){
        for(String str : bookName){
            if(str.equals(name)){
                return true;
            }
        }
        return false;
    }
}
