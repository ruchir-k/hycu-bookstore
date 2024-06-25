package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryBookRepo;
import org.hycu.bookstore.domain.entities.Book;

public class AddNewBook {
    public void invoke(String title, String author, int price, int numOfCopies) {
        InMemoryBookRepo inMemoryBookRepo = InMemoryBookRepo.getInstance();
        Book newBook = new Book(
                inMemoryBookRepo.getAvailableBooks().size() + 1,
                title,
                author,
                price,
                numOfCopies
        );
        inMemoryBookRepo.addBook(newBook);
        System.out.println("Details of Book(s) added successfully:");
        System.out.println(newBook);
    }
}
