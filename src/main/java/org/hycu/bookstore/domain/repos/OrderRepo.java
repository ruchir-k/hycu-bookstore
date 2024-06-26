package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.Order;

import java.util.HashMap;

public interface OrderRepo {
    public void saveOrder(Order order);
    public HashMap<Integer, Order> getAllOrders();
}
