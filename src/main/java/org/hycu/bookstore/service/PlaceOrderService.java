package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.PlaceOrder;

public class PlaceOrderService implements Service{
    @Override
    public void invoke() {
        PlaceOrder placeOrder = new PlaceOrder();
        placeOrder.invoke();
    }
}
