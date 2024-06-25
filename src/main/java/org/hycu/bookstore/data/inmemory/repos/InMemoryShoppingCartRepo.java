package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.ShoppingCart;
import org.hycu.bookstore.domain.repos.ShoppingCartRepo;

public class InMemoryShoppingCartRepo implements ShoppingCartRepo {

    /**
     * Shopping cart object
     */
    ShoppingCart shoppingCart;

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
    public void upsertShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public void clearShoppingCart() {
        shoppingCart = null;
    }
}
