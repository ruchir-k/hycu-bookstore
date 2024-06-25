package org.hycu.bookstore.service;

import org.hycu.bookstore.domain.usecases.AddNewBook;

import java.util.Scanner;

public class AddNewBookService implements Service{

    @Override
    public void invoke() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("AddNewBookService ----------------------");
        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("Author:");
        String author = scanner.nextLine();
        System.out.println("Price:");
        int price = scanner.nextInt();
        System.out.println("Number of copies:");
        int numOfCopies = scanner.nextInt();

        AddNewBook addNewBook = new AddNewBook();
        addNewBook.invoke(title, author, price, numOfCopies);
        System.out.println("----------------------------------------");
    }
}
