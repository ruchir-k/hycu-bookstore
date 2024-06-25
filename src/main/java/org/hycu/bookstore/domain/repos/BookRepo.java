package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.Book;

import java.util.HashMap;

public interface BookRepo {
    public void addBook(Book book);
    public HashMap<Integer, Book> getAvailableBooks();
}
