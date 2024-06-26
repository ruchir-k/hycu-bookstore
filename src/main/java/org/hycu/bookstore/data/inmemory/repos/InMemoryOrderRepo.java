package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.Order;
import org.hycu.bookstore.domain.repos.OrderRepo;

import java.util.HashMap;

public class InMemoryOrderRepo implements OrderRepo {

    /**
     * In-memory storage for orders.
     */
    HashMap<Integer, Order> orders = new HashMap<>();

    Integer uniqueOrderId = 1;

    /**
     * Singleton instance.
     */
    private static InMemoryOrderRepo instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private InMemoryOrderRepo() {}

    /**
     * Get the singleton instance.
     */
    public static synchronized InMemoryOrderRepo getInstance() {
        if (instance == null) {
            instance = new InMemoryOrderRepo();
        }
        return instance;
    }

    @Override
    public void saveOrder(Order order) {
        orders.put(order.getOrderId(), order);
    }

    @Override
    public HashMap<Integer, Order> getAllOrders() {
        return orders;
    }

    public Integer getUniqueOrderId() {
        return uniqueOrderId;
    }
}
