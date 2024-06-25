package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.RegisterNewUser;

import java.util.Scanner;

public class RegisterNewUserService implements Service{

    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RegisterNewUserService ----------------------");
        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();

        RegisterNewUser registerNewUser = new RegisterNewUser();
        registerNewUser.invoke(username, password);
        System.out.println("----------------------------------------");
    }
}
