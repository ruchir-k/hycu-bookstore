package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.ViewAllOrders;

public class ViewAllOrdersService implements Service{
    @Override
    public void invoke() {
        System.out.println("Viewing all orders:");

        ViewAllOrders viewAllOrders = new ViewAllOrders();
        viewAllOrders.invoke();

        System.out.println("-----------------------");
    }
}
