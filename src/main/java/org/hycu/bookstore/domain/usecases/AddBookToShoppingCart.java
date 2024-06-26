package org.hycu.bookstore.domain.usecases;

import org.hycu.bookstore.data.inmemory.repos.InMemoryBookRepo;
import org.hycu.bookstore.data.inmemory.repos.InMemoryShoppingCartRepo;
import org.hycu.bookstore.domain.entities.Book;
import org.hycu.bookstore.domain.entities.ShoppingCart;

public class AddBookToShoppingCart {
    public void invoke(int bookId, int quantity) {
        InMemoryBookRepo inMemoryBookRepo = InMemoryBookRepo.getInstance();
        InMemoryShoppingCartRepo inMemoryShoppingCartRepo = InMemoryShoppingCartRepo.getInstance();

        if(inMemoryBookRepo.getAvailableBooks().isEmpty()){
            System.out.println("No books available.");
            return;
        }

        ShoppingCart shoppingCart = inMemoryShoppingCartRepo.getShoppingCart();

        if(inMemoryBookRepo.getAvailableBooks().containsKey(bookId)){
            Book currBook = inMemoryBookRepo.getAvailableBooks().get(bookId);

            if(currBook.getNumOfCopies() >= quantity){
                // Update the number of copies of the book in the InMemoryBookRepo
                currBook.setNumOfCopies(currBook.getNumOfCopies() - quantity);

                // Update the number of copies of the book in the shopping cart
                Book addBookToCart = new Book(
                        currBook.getBookId(),
                        currBook.getTitle(),
                        currBook.getAuthor(),
                        currBook.getPrice(),
                        quantity
                );
                shoppingCart.addBook(addBookToCart);
                inMemoryShoppingCartRepo.upsertShoppingCart(shoppingCart);

                System.out.println("Successfully added "+ quantity +" copies of " +
                        currBook.getTitle() + "by" + currBook.getAuthor() +" to shopping cart successfully.");

            } else {
                System.out.println("Not enough copies available.");
            }

        } else {
            System.out.println("Book not found.");
        }

    }
}
