# Library Management System in Java

This repository contains a simple Java program that simulates a basic library management system. It allows you to add books, remove books, and display the current list of books in the library.

## Overview

The system consists of two main classes:

-   **`Library`**: This class manages a collection of `Book` objects. It provides functionalities to:
    -   Add a new book to the library.
    -   Remove a book from the library based on its title.
    -   Display all the books currently in the library.
-   **`Book`**: This class represents a book with a title and an author.

The `main` method within the `Library` class demonstrates the usage of these functionalities by creating a library, adding some books, displaying them, removing a book, and then displaying the updated list.

## Getting Started

To run this program, you need to have Java Development Kit (JDK) installed on your system.

1.  **Save the code:** Save the provided Java code into two files: `Library.java` and `Book.java` in the same directory.
2.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where you saved the files, and compile the Java files using the following command:

    ```bash
    javac Library.java Book.java
    ```

    This will generate `Library.class` and `Book.class` files.
3.  **Run the program:** Execute the `Library` class using the following command:

    ```bash
    java Library
    ```

    This will run the `main` method in the `Library` class and you will see the output in your console.

## Functionality

### Adding Books

The `addBook(Book book)` method allows you to add a `Book` object to the library's collection. It checks if the provided book is not null before adding it.

```java
public void addBook(Book book) {
    if (book != null) {
        this.books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    } else {
        System.out.println("Cannot add a null book.");
    }
}
```

### Removing Books

The `removeBook(String title)` method removes a book from the library based on its title. It iterates through the list of books and removes the first book it finds with a matching title (case-insensitive).

```java
public void removeBook(String title) {
    for (int i = 0; i < this.books.size(); i++) {
        if (this.books.get(i).getTitle().equalsIgnoreCase(title)) {
            Book removedBook = this.books.remove(i);
            System.out.println(removedBook.getTitle() + " has been removed from the library.");
            return;
        }
    }
    System.out.println("Book with title '" + title + "' not found in the library.");
}
```

### Displaying Books

The `displayBooks()` method displays all the books currently present in the library. If the library is empty, it prints a message indicating that.

```java
public void displayBooks() {
    if (this.books.isEmpty()) {
        System.out.println("The library is currently empty.");
    } else {
        System.out.println("Books in the library:");
        for (Book book : this.books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
```

## `Book` Class

The `Book` class is a simple representation of a book with two private attributes: `title` and `author`. It provides a constructor to initialize these attributes and getter methods to access them.

```java
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
```

## Example Usage

The `main` method in the `Library` class demonstrates how to use the `Library` and `Book` classes:

```java
public static void main(String[] args) {
    // Create a new Library object
    Library library = new Library();

    // Create some Book objects
    Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
    Book book2 = new Book("Pride and Prejudice", "Jane Austen");
    Book book3 = new Book("1984", "George Orwell");

    // Add books to the library
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(null); // Try adding a null book

    // Display the books in the library
    library.displayBooks();

    // Remove a book from the library
    library.removeBook("Pride and Prejudice");
    library.removeBook("The Great Gatsby"); // Try removing a book that doesn't exist

    // Display the books again after removal
    library.displayBooks();
}
```

## Potential Enhancements

  - **Search Functionality:** Implement a feature to search for books by title or author.
  - **Unique Book Identification:** Add a unique identifier (e.g., ISBN) to each book.
  - **Quantity Tracking:** Keep track of the number of copies available for each book.
  - **Borrowing/Returning:** Implement functionality for borrowing and returning books, including tracking who has borrowed which book and due dates.
  - **User Management:** Add classes for `Member` and functionalities for registering members, checking out books, and managing fines.
  - **Data Persistence:** Implement saving and loading the library data to a file or database.
  - **Error Handling:** Add more robust error handling for various scenarios.
  - **User Interface:** Develop a command-line interface (CLI) or a graphical user interface (GUI) for easier interaction.

## Author

Durjoy Barua / https://github.com/iamdurjoybarua
