package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.ShoppingCart;

public interface ShoppingCartRepo {
    public void upsertShoppingCart(ShoppingCart shoppingCart);
    public ShoppingCart getShoppingCart();
    public void clearShoppingCart();
}
