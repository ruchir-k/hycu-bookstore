package org.hycu.bookstore.domain.entities;

public class Order {
    private final int orderId;
    private final ShoppingCart shoppingCart;

    public Order(int orderId, ShoppingCart shoppingCart) {
        this.orderId = orderId;
        this.shoppingCart = shoppingCart;
    }

    public int getOrderId() {
        return orderId;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + "\n" +
                "Shopping Cart: " + shoppingCart + "\n";
    }
}
