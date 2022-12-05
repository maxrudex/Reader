package app;

public class Book {
    private String bookName, author;
    private int counter = 0;

    public Book() {
        ++counter;
        bookName = "Новая книга" + counter;
        author = "Неизвестный";
    }
    public Book(String bookName, String author) {
        ++counter;
        this.bookName = bookName;
        this.author = author;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
