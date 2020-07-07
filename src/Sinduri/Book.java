package Sinduri;

import java.util.ArrayList;
import java.util.List;

public abstract class Book {
    String bookTitle;
    String bookAuthor;
    String bookCategory;
    String bookLocation;
    String ISBN;
    boolean bookAvailability;

    List listBooks = new ArrayList();

    abstract void displayBooks();

/*    public Book(String bookTitle, String bookAuthor, String bookCategory, String bookLocation, String ISBN, boolean bookAvailability) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookLocation = bookLocation;
        this.ISBN = ISBN;
        this.bookAvailability = bookAvailability;
    }*/
}
