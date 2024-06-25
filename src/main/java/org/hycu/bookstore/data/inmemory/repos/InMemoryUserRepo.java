package org.hycu.bookstore.data.inmemory.repos;

import org.hycu.bookstore.domain.entities.User;
import org.hycu.bookstore.domain.repos.UserRepo;

import java.util.HashMap;

public class InMemoryUserRepo implements UserRepo {

    /**
     * In-memory storage for users.
     */
    HashMap<Integer, User> users = new HashMap<>();

    Integer uniqueUserId = 1;

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
        users.put(user.getUserId(), user);
        uniqueUserId++;
    }

    @Override
    public HashMap<Integer, User> getRegisteredUsers() {
        return users;
    }

    public Integer getUniqueUserId() {
        return uniqueUserId;
    }
}