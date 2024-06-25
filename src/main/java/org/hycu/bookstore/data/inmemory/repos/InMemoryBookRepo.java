package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.Book;
import org.hycu.bookstore.domain.repos.BookRepo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepo implements BookRepo {

    /**
     * Book data is stored in a list.
     */
    List<Book> books = new ArrayList<>();

    /**
     * Singleton instance.
     */
    private static InMemoryBookRepo instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private InMemoryBookRepo() {}

    /**
     * Get the singleton instance.
     */
    public static synchronized InMemoryBookRepo getInstance() {
        if (instance == null) {
            instance = new InMemoryBookRepo();
        }
        return instance;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAvailableBooks() {
        return books;
    }

}
