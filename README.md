# Mini Online Bookstore

## Overview
Designed a basic bookstore in Java, follwing domain driven design. It includes features to manage books, users and shopping cart. The basic paradigms of Object Oriented Programming such as Abstraction and Encapsulation have been followed.

## Features

1. **Book Management:**
    - Add a new book to the bookstore inventory.
    - Display the list of available books.

2. **User Management:**
    - Register a new user.
    - Display the list of registered users.

3. **Order Management:**
    - Allow users to add books to their shopping cart.
    - Allow users to place an order.
    - Calculate the total cost of the order.
    - List all orders placed.


## Project Structure
```
.
└── main
    └── java
        └── org
            └── hycu
                └── bookstore
                    ├── Application.java
                    ├── Main.java //starting point of the program
                    ├── data
                    │   └── inmemory
                    │       └── repos
                    │           ├── InMemoryBookRepo.java
                    │           ├── InMemoryOrderRepo.java
                    │           ├── InMemoryShoppingCartRepo.java
                    │           └── InMemoryUserRepo.java
                    ├── domain
                    │   ├── entities
                    │   │   ├── Book.java
                    │   │   ├── Order.java
                    │   │   ├── ShoppingCart.java
                    │   │   └── User.java
                    │   └── usecases
                    │       ├── AddBookToShoppingCart.java
                    │       ├── AddNewBook.java
                    │       ├── CalculateTotalShoppingCartValue.java
                    │       ├── ClearShoppingCart.java
                    │       ├── DisplayAllAvailableBooks.java
                    │       ├── DisplayAllRegisteredUsers.java
                    │       ├── PlaceOrder.java
                    │       ├── RegisterNewUser.java
                    │       ├── SaveOrder.java
                    │       ├── VerifyUser.java
                    │       └── ViewAllOrders.java
                    ├── exceptions
                    │   └── InvalidInputException.java
                    └── service
                        ├── AddBookToShoppingCartService.java
                        ├── AddNewBookService.java
                        ├── CalculateTotalShoppingCartValueService.java
                        ├── ClearShoppingCartService.java
                        ├── DisplayAllAvailableBooksService.java
                        ├── DisplayAllRegisteredUsersService.java
                        ├── PlaceOrderService.java
                        ├── RegisterNewUserService.java
                        ├── VerifyUserService.java
                        └── ViewAllOrdersService.java
```

## Run Program
Build the program first:
```
./gradlew build
```

Run the program:
```
./gradlew run
```