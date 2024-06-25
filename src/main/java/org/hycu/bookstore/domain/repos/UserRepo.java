package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.User;

import java.util.HashMap;

public interface UserRepo {
    public void registerUser(User user);
    public HashMap<Integer, User> getRegisteredUsers();
}
