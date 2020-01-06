package entity;

public class BookModel {
    private String ISBN;
    private String book_name;
    private String book_author;
    private String book_press;
    private int public_year;
    private double book_price;
    private int book_storage;
    private String book_type;

    public BookModel(String ISBN, String book_name, String book_author, String book_press, int public_year, double book_price, int book_storage, String book_type) {
        this.ISBN = ISBN;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_press = book_press;
        this.public_year = public_year;
        this.book_price = book_price;
        this.book_storage = book_storage;
        this.book_type = book_type;
    }

    public BookModel() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_press() {
        return book_press;
    }

    public void setBook_press(String book_press) {
        this.book_press = book_press;
    }

    public int getPublic_year() {
        return public_year;
    }

    public void setPublic_year(int public_year) {
        this.public_year = public_year;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public int getBook_storage() {
        return book_storage;
    }

    public void setBook_storage(int book_storage) {
        this.book_storage = book_storage;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }
}
