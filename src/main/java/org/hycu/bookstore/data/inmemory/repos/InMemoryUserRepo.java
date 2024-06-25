package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.User;
import org.hycu.bookstore.domain.repos.UserRepo;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepo implements UserRepo {

    /**
     * User data is stored in a list.
     */
    private List<User> users = new ArrayList<>();

    /**
     * Singleton instance.
     */
    private static InMemoryUserRepo instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private InMemoryUserRepo() {}

    /**
     * Get the singleton instance.
     */
    public static synchronized InMemoryUserRepo getInstance() {
        if (instance == null) {
            instance = new InMemoryUserRepo();
        }
        return instance;
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> listRegisteredUsers() {
        return users;
    }

}