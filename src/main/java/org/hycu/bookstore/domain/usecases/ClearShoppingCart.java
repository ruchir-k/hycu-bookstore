package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryBookRepo;
import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;
import org.hycu.bookstore.domain.entities.Book;
import org.hycu.bookstore.domain.entities.ShoppingCart;

public class ClearShoppingCart {
    public void invoke() {
        InMemoryShoppingCartRepo inMemoryShoppingCartRepo = InMemoryShoppingCartRepo.getInstance();
        InMemoryBookRepo inMemoryBookRepo = InMemoryBookRepo.getInstance();

        ShoppingCart shoppingCart = inMemoryShoppingCartRepo.getShoppingCart();

        if(shoppingCart == null){
            return;
        }

        // Place the books in shopping cart back to the available books
        for(Book book : shoppingCart.getBooks()){
            inMemoryBookRepo.getAvailableBooks().get(book.getBookId()).setNumOfCopies(
                    inMemoryBookRepo.getAvailableBooks().get(book.getBookId()).getNumOfCopies() + book.getNumOfCopies()
            );
        }

        inMemoryShoppingCartRepo.clearShoppingCart();

        System.out.println("Shopping cart cleared successfully.");
    }
}
