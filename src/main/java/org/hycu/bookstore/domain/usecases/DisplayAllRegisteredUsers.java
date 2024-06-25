package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryUserRepo;

public class DisplayAllRegisteredUsers {
    public void invoke() {
        InMemoryUserRepo inMemoryUserRepo = InMemoryUserRepo.getInstance();
        if(inMemoryUserRepo.listRegisteredUsers().isEmpty()){
            System.out.println("No users registered yet.");
            return;
        }
        System.out.println("Registered users:");
        System.out.println("---------------------------------");
        inMemoryUserRepo.listRegisteredUsers().forEach(user -> {
            System.out.println("User ID: " + user.getUserId());
            System.out.println("Username: " + user.getUsername());
            System.out.println("---------------------------------");
        });
    }
}
