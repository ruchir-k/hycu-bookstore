package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;
import org.hycu.bookstore.domain.entities.Book;

public class CalculateTotalShoppingCartValue {
    public void invoke() {
        InMemoryShoppingCartRepo inMemoryShoppingCartRepo = InMemoryShoppingCartRepo.getInstance();

        int totalValue = 0;
        if(inMemoryShoppingCartRepo.getShoppingCart() != null){
            for (Book book : inMemoryShoppingCartRepo.getShoppingCart().getBooks()) {
                totalValue += book.getPrice() * book.getNumOfCopies();
            }
        }

        System.out.println("Total value of shopping cart: " + totalValue);
    }
}
