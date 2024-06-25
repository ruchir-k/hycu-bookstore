package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.ClearShoppingCart;

public class ClearShoppingCartService implements Service{
    @Override
    public void invoke() {
        System.out.println("ClearShoppingCartService ----------------------");
        ClearShoppingCart clearShoppingCart = new ClearShoppingCart();
        clearShoppingCart.invoke();
        System.out.println("Shopping cart cleared.");
        System.out.println("----------------------------------------");
    }
}
