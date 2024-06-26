package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryOrderRepo;
import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;
import org.hycu.bookstore.domain.entities.Order;
import org.hycu.bookstore.domain.entities.ShoppingCart;

public class SaveOrder {
    public void invoke(ShoppingCart shoppingCart) {
        InMemoryShoppingCartRepo shoppingCartRepo = InMemoryShoppingCartRepo.getInstance();
        InMemoryOrderRepo orderRepo = InMemoryOrderRepo.getInstance();

        Order newOrder = new Order(
                orderRepo.getUniqueOrderId(),
                shoppingCartRepo.getShoppingCart()
        );
        orderRepo.saveOrder(newOrder);
        System.out.println("Order saved successfully:"+ newOrder);
    }
}
