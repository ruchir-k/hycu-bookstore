package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.Book;
import org.hycu.bookstore.domain.entities.ShoppingCart;

import java.util.List;

public interface ShoppingCartRepo {
    public void createShoppingCart(ShoppingCart shoppingCart);
    public List<ShoppingCart> getShoppingCarts();
}
