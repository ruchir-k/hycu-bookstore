package org.hycu.bookstore.domain.repos;

import org.hycu.bookstore.domain.entities.User;

import java.util.List;

public interface UserRepo {
    public void registerUser(User user);
    public List<User> listRegisteredUsers();
}
