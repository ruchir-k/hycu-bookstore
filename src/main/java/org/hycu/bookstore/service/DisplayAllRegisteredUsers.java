package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.DisplayAllAvailableBooks;

public class DisplayAllRegisteredUsers implements Service{

    @Override
    public void invoke() {
        System.out.println("DisplayAllAvailableBooksService ----------------------");

        DisplayAllAvailableBooks displayAllAvailableBooks = new DisplayAllAvailableBooks();
        displayAllAvailableBooks.invoke();

        System.out.println("----------------------------------------");
    }
}
