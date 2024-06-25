package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.DisplayAllRegisteredUsers;

public class DisplayAllRegisteredUsersService implements Service{

    @Override
    public void invoke() {
        System.out.println("DisplayAllRegisteredUsersService ----------------------");

        DisplayAllRegisteredUsers displayAllRegisteredUsers = new DisplayAllRegisteredUsers();
        displayAllRegisteredUsers.invoke();

        System.out.println("----------------------------------------");
    }
}
