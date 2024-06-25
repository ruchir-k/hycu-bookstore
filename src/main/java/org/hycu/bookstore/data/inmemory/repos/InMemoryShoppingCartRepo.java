package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.ShoppingCart;
import org.hycu.bookstore.domain.repos.ShoppingCartRepo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryShoppingCartRepo implements ShoppingCartRepo {

    /**
     * ShoppingCart data is stored in a list.
     */
    private List<ShoppingCart> shoppingCarts = new ArrayList<>();

    /**
     * Singleton instance.
     */
    private static InMemoryShoppingCartRepo instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private InMemoryShoppingCartRepo() {}

    /**
     * Get the singleton instance.
     */
    public static synchronized InMemoryShoppingCartRepo getInstance() {
        if (instance == null) {
            instance = new InMemoryShoppingCartRepo();
        }
        return instance;
    }

    @Override
    public void createShoppingCart(ShoppingCart shoppingCart) {
        shoppingCarts.add(shoppingCart);
    }

    @Override
    public List<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

}
