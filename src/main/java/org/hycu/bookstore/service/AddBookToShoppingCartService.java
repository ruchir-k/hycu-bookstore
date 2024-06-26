package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.AddBookToShoppingCart;

import java.util.Scanner;

public class AddBookToShoppingCartService implements Service{

    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("AddBookToShoppingCartService ----------------------");

        System.out.println("Enter book ID to Add to Cart:");
        int bookId = scanner.nextInt();
        System.out.println("Enter number of copies:");
        int numOfCopies = scanner.nextInt();

        AddBookToShoppingCart addBookToShoppingCart = new AddBookToShoppingCart();
        addBookToShoppingCart.invoke(bookId, numOfCopies);


        System.out.println("----------------------------------------");
    }
}
