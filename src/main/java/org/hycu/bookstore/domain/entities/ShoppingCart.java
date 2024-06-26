package org.hycu.bookstore.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> books;

    public ShoppingCart(List<Book> books) {
        this.books = new ArrayList<>(books);
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
