package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.VerifyUser;
import org.hycu.bookstore.exceptions.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerifyUserService implements Service{

    public int verify() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VerifyUserService ----------------------");

        int verifiedUserId = -1;
        try {
            System.out.println("Username:");
            String username = scanner.nextLine();

            System.out.println("Password:");
            String password = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                throw new InvalidInputException("Username and password must not be empty.");
            }

            VerifyUser verifyUser = new VerifyUser();
            verifiedUserId = verifyUser.invoke(username, password);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a string for username and password.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        if (verifiedUserId != -1) {
            System.out.println("User verified successfully.");
            return verifiedUserId;
        } else {
            System.out.println("User not verified.");
            return -1;
        }
    }

    @Override
    public void invoke() {

    }
}
