package org.hycu.bookstore.domain.entities;

public class Book {
    private final int bookId;
    private final String title;
    private final String author;
    private final int price;
    private int numOfCopies;

    public Book(int bookId, String title, String author, int price, int numOfCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.numOfCopies = numOfCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }
}
