package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.AddNewBook;
import org.hycu.bookstore.exceptions.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNewBookService implements Service{

    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("AddNewBookService ----------------------");
        try {
            System.out.println("Title:");
            String title = scanner.nextLine();
            System.out.println("Author:");
            String author = scanner.nextLine();
            System.out.println("Price:");
            int price = scanner.nextInt();
            System.out.println("Number of copies:");
            int numOfCopies = scanner.nextInt();

            checkValidInput(price, numOfCopies);

            AddNewBook addNewBook = new AddNewBook();
            addNewBook.invoke(title, author, price, numOfCopies);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer for price and number of copies.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------");
    }

    private void checkValidInput(int price, int numOfCopies) {
        if(price < 0 || numOfCopies < 0) {
            throw new InvalidInputException("Price and number of copies must be positive integers.");
        }
    }
}
