package org.hycu.bookstore.domain.entities;

import java.util.List;

public class ShoppingCart {
    private final int cartId;
    private final int userId;
    private List<Book> books;

    public ShoppingCart(int cartId, int userId, List<Book> books) {
        this.cartId = cartId;
        this.userId = userId;
        this.books = books;
    }

    public int getCartId() {
        return cartId;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
