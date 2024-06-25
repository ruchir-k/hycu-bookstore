package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryBookRepo;
import org.hycu.bookstore.domain.entities.Book;

import java.util.HashMap;
import java.util.Map;

public class DisplayAllAvailableBooks {
    public void invoke() {
        InMemoryBookRepo bookRepo = InMemoryBookRepo.getInstance();
        if (bookRepo.getAvailableBooks().isEmpty()) {
            System.out.println("No books available at the moment.");
            return;
        }

        System.out.println("Available books:");
        System.out.println("---------------------------------");

        HashMap<Integer, Book> books = bookRepo.getAvailableBooks();
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            Integer bookId = entry.getKey();
            Book book = entry.getValue();
            System.out.println("Book ID: " + bookId);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Number of copies: " + book.getNumOfCopies());
            System.out.println("---------------------------------");
        }

    }

}


