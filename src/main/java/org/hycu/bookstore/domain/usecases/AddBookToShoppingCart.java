package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryBookRepo;
import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;
import org.hycu.bookstore.domain.entities.ShoppingCart;

public class AddBookToShoppingCart {
    public void invoke(int bookId, int userId, int quantity) {
        InMemoryBookRepo inMemoryBookRepo = InMemoryBookRepo.getInstance();
        InMemoryShoppingCartRepo inMemoryShoppingCartRepo = InMemoryShoppingCartRepo.getInstance();

        if(inMemoryBookRepo.getAvailableBooks().isEmpty()){
            System.out.println("No books available.");
            return;
        }

        ShoppingCart shoppingCart = inMemoryShoppingCartRepo.getShoppingCart();


    }
}
