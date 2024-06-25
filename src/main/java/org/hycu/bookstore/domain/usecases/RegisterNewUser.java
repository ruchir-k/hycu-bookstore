package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryUserRepo;
import org.hycu.bookstore.domain.entities.User;

public class RegisterNewUser {
    public void invoke(String username, String password) {
        InMemoryUserRepo inMemoryUserRepo = InMemoryUserRepo.getInstance();
        User newUser = new User(
                inMemoryUserRepo.getUniqueUserId(),
                username,
                password
        );
        inMemoryUserRepo.registerUser(newUser);
        System.out.println("User registered successfully:");
        System.out.println(newUser);
    }
}
