package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;

public class PlaceOrder {
    public void invoke() {
        System.out.println("Order placed successfully. Shopping cart reset.");
        InMemoryShoppingCartRepo inMemoryShoppingCartRepo = InMemoryShoppingCartRepo.getInstance();

        SaveOrder saveOrder = new SaveOrder();
        saveOrder.invoke(inMemoryShoppingCartRepo.getShoppingCart());

        inMemoryShoppingCartRepo.clearShoppingCart();
    }
}
