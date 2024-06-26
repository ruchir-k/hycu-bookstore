package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryOrderRepo;
import org.hycu.bookstore.domain.entities.Order;

import java.util.HashMap;

public class ViewAllOrders {
    public void invoke() {
        InMemoryOrderRepo inMemoryOrderRepo = InMemoryOrderRepo.getInstance();
        HashMap<Integer, Order> orders = inMemoryOrderRepo.getAllOrders();

        System.out.println("All orders:");

        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        }

        for (Order order : orders.values()) {
            System.out.println(order);
        }

        System.out.println("End of orders.");
    }
}
