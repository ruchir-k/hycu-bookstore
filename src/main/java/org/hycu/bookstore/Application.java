package org.hycu.bookstore;

import org.hycu.bookstore.domain.usecases.CalculateTotalShoppingCartValue;
import org.hycu.bookstore.domain.usecases.PlaceOrder;
import org.hycu.bookstore.service.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome to the Bookstore!");

        int option = 0;
        while (option != 5) {

            try {
                System.out.println("1. Book Management");
                System.out.println("2. User Management");
                System.out.println("3. Order Management");
                System.out.println("4. View All Orders");
                System.out.println("5. Exit");
                System.out.println("Please select an option:");
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }


            switch (option) {
                case 1:
                    bookManagement();
                    break;
                case 2:
                    userManagement();
                    break;
                case 3:
                    orderManagement();
                    break;
                case 4:
                    viewAllOrders();
                    break;
                case 5:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }

    private void bookManagement() {
        System.out.println("Book Management");

        int option = 0;
        while (option != 3) {

            try {
                System.out.println("1. Add New Book");
                System.out.println("2. View All Books");
                System.out.println("3. Go Back");
                System.out.println("Please select an option:");
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            switch (option) {
                case 1:
                    AddNewBookService addNewBookService = new AddNewBookService();
                    addNewBookService.invoke();
                    break;
                case 2:
                    DisplayAllAvailableBooksService displayAllAvailableBooksService = new DisplayAllAvailableBooksService();
                    displayAllAvailableBooksService.invoke();
                    break;
                case 3:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }

    private void userManagement() {
        System.out.println("User Management");

        int option = 0;
        while (option != 3) {

            try {
                System.out.println("1. Register New User");
                System.out.println("2. View All Users");
                System.out.println("3. Go Back");
                System.out.println("Please select an option:");
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            switch (option) {
                case 1:
                    RegisterNewUserService registerNewUserService = new RegisterNewUserService();
                    registerNewUserService.invoke();
                    break;
                case 2:
                    DisplayAllRegisteredUsersService displayAllRegisteredUsersService = new DisplayAllRegisteredUsersService();
                    displayAllRegisteredUsersService.invoke();
                    break;
                case 3:
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }

    private void orderManagement() {
        System.out.println("Order Management");

        VerifyUserService verifyUserService = new VerifyUserService();
        int verifiedUserId = verifyUserService.verify();
        if (verifiedUserId == -1) {
            System.out.println("User not verified. Please verify user to proceed.");
            return;
        }

        int option = 0;
        while (option != 4) {

            try {
                System.out.println("1. Add Book to Shopping Cart");
                System.out.println("2. Calculate Total Shopping Cart Value");
                System.out.println("3. Place Order");
                System.out.println("4. Go Back");
                System.out.println("Please select an option:");
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            switch (option) {
                case 1:
                    AddBookToShoppingCartService addBookToShoppingCartService = new AddBookToShoppingCartService();
                    addBookToShoppingCartService.invoke();
                    break;
                case 2:
                    CalculateTotalShoppingCartValue calculateTotalShoppingCartValue = new CalculateTotalShoppingCartValue();
                    calculateTotalShoppingCartValue.invoke();
                    break;
                case 3:
                    PlaceOrder placeOrder = new PlaceOrder();
                    placeOrder.invoke();
                    break;
                case 4:
                    ClearShoppingCartService clearShoppingCartService = new ClearShoppingCartService();
                    clearShoppingCartService.invoke();
                    System.out.println("Shopping cart cleared successfully.");
                    System.out.println("Going back to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }

        // To clear the userId from the shopping cart
        ClearShoppingCartService clearShoppingCartService = new ClearShoppingCartService();
        clearShoppingCartService.invoke();
    }

    private void viewAllOrders() {
        ViewAllOrdersService viewAllOrdersService = new ViewAllOrdersService();
        viewAllOrdersService.invoke();
    }
}
