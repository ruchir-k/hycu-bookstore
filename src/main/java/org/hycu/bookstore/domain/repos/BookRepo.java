package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.Book;
import java.util.List;

public interface BookRepo {
    public void addBook(Book book);
    public List<Book> getAvailableBooks();
}
