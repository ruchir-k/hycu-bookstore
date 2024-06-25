package org.hycu.bookstore.domain.entities;

import java.util.List;

public class ShoppingCart {
    private final int userId;
    private List<Book> books;

    public ShoppingCart(int userId, List<Book> books) {
        this.userId = userId;
        this.books = books;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void  addBook(Book book) {
        this.books.add(book);
    }
}
