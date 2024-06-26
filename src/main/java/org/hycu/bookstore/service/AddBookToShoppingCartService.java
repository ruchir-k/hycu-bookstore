package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.AddBookToShoppingCart;
import org.hycu.bookstore.exceptions.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddBookToShoppingCartService implements Service{

    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("AddBookToShoppingCartService ----------------------");

        try {
            System.out.println("Enter book ID to Add to Cart:");
            int bookId = scanner.nextInt();
            System.out.println("Enter number of copies:");
            int numOfCopies = scanner.nextInt();

            AddBookToShoppingCart addBookToShoppingCart = new AddBookToShoppingCart();
            addBookToShoppingCart.invoke(bookId, numOfCopies);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer for book ID and number of copies.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------");
    }

    public void checkValidInput(int bookId, int numOfCopies) {
        if(bookId < 0 || numOfCopies < 0) {
            throw new InvalidInputException("Book ID and number of copies must be positive integers.");
        }
    }
}
