package book_management.book;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 * 书架应当保存有
 */

public class BookList {
    private List<Book> books = new ArrayList<>();

    public BookList(){
        //产生一个书架时，上面默认有4本书
        books.add(new Book("朝花夕拾", "鲁迅", 38.8, "散文集"));
        books.add(new Book("围城", "钱钟书", 36.0, "现代文学小说"));
        books.add(new Book("骆驼祥子", "老舍", 29.5, "长篇小说"));
        books.add(new Book("热爱生命", "Jack London", 28.8, "中篇小说"));
    }
}
