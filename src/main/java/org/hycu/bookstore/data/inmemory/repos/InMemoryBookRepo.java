package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.Book;
import org.hycu.bookstore.domain.repos.BookRepo;

import java.util.HashMap;

public class InMemoryBookRepo implements BookRepo {

    /**
     * In-memory storage for books.
     */
    HashMap<Integer, Book> books = new HashMap<>();

    Integer uniqueBookId = 1;

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
        books.put(book.getBookId(), book);
        uniqueBookId++;
    }

    @Override
    public HashMap<Integer, Book> getAvailableBooks() {
        return books;
    }

    public Integer getUniqueBookId() {
        return uniqueBookId;
    }
}
