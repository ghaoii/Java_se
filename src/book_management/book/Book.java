package book_management.book;


/**
 * 每本书的对象
 * 应当包含书名、作者、价格
 */

public class Book {
    private String name;
    private String author;
    private Double price;
    private String type;
    private boolean isBorrowed;

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public Book(String name, String author, Double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
}
