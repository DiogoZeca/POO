package AvAula07;

public class Book extends LibraryItem {

    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "[Book: " + super.toString() + ", author=" + author + "]";
    }
    
}
