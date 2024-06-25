package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryUserRepo;
import org.hycu.bookstore.domain.entities.User;

import java.util.HashMap;

public class DisplayAllRegisteredUsers {
    public void invoke() {
        InMemoryUserRepo inMemoryUserRepo = InMemoryUserRepo.getInstance();
        if(inMemoryUserRepo.getRegisteredUsers().isEmpty()){
            System.out.println("No users registered yet.");
            return;
        }
        System.out.println("Registered users:");
        System.out.println("---------------------------------");

        HashMap<Integer, User> users = inMemoryUserRepo.getRegisteredUsers();
        for (User user : users.values()) {
            System.out.println("User ID: " + user.getUserId());
            System.out.println("Username: " + user.getUsername());
            System.out.println("---------------------------------");
        }
    }
}
