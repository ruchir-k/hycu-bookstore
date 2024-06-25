package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryBookRepo;

public class DisplayAllAvailableBooks {
    public void invoke() {
        InMemoryBookRepo bookRepo = InMemoryBookRepo.getInstance();
        if (bookRepo.getAvailableBooks().isEmpty()) {
            System.out.println("No books available at the moment.");
            return;
        }
        System.out.println("Available books:");
        System.out.println("---------------------------------");
        bookRepo.getAvailableBooks().forEach(book -> {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Number of copies: " + book.getNumOfCopies());
            System.out.println("---------------------------------");
        });
    }

}


