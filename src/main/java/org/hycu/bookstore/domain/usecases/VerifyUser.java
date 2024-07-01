package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;
import org.hycu.bookstore.data.inmemory.repos.InMemoryUserRepo;
import org.hycu.bookstore.domain.entities.ShoppingCart;
import org.hycu.bookstore.domain.entities.User;

import java.util.HashMap;

public class VerifyUser {

    public int invoke(String username, String password) {

        InMemoryUserRepo userRepo = InMemoryUserRepo.getInstance();
        HashMap<Integer, User> users = userRepo.getRegisteredUsers();

        InMemoryShoppingCartRepo shoppingCartRepo = InMemoryShoppingCartRepo.getInstance();
        ShoppingCart shoppingCart = shoppingCartRepo.getShoppingCart();

        for (User user : users.values()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                shoppingCart.setUserId(user.getUserId());
                shoppingCartRepo.upsertShoppingCart(shoppingCart);
                return user.getUserId();
            }
        }

        return -1;
    }
}
