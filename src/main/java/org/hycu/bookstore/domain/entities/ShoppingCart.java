package org.hycu.bookstore.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int userId;
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

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User ID: ").append(userId).append("\n");
        for (Book book : books) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }
}
