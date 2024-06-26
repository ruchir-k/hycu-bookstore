package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.RegisterNewUser;
import org.hycu.bookstore.exceptions.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterNewUserService implements Service{

    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RegisterNewUserService ----------------------");

        try {
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                throw new InvalidInputException("Username and password must not be empty.");
            }

            RegisterNewUser registerNewUser = new RegisterNewUser();
            registerNewUser.invoke(username, password);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a string for username and password.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------");
    }
}
