package org.hycu.bookstore;

import org.hycu.bookstore.service.AddNewBookService;
import org.hycu.bookstore.service.DisplayAllAvailableBooksService;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome to the Bookstore!");

        int option = 0;
        while (option != 4) {

            System.out.println("1. Book Management");
            System.out.println("2. User Management");
            System.out.println("3. Order Management");
            System.out.println("4. Exit");
            System.out.println("Please select an option:");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    bookManagement();
                    break;
                case 2:
                    userManagement();
                    break;
//                case 3:
//                    orderManagement();
//                    break;
                case 4:
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
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Go Back");
            System.out.println("Please select an option:");
            option = scanner.nextInt();

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
            System.out.println("1. Register New User");
            System.out.println("2. View All Users");
            System.out.println("3. Go Back");
            System.out.println("Please select an option:");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Register New User");
                    break;
                case 2:
                    System.out.println("View All Users");
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


}
