import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books; // A list to hold the books in the library

    // Constructor to initialize the Library with an empty collection of books
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     *
     * @param book The Book object to be added.
     */
    public void addBook(Book book) {
        if (book != null) {
            this.books.add(book);
            System.out.println(book.getTitle() + " has been added to the library.");
        } else {
            System.out.println("Cannot add a null book.");
        }
    }

    /**
     * Removes a book from the library based on its title.
     *
     * @param title The title of the book to be removed.
     */
    public void removeBook(String title) {
        // Iterate through the list of books to find the book with the given title
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equalsIgnoreCase(title)) {
                Book removedBook = this.books.remove(i);
                System.out.println(removedBook.getTitle() + " has been removed from the library.");
                return; // Exit the method once the book is found and removed
            }
        }
        System.out.println("Book with title '" + title + "' not found in the library.");
    }

    /**
     * Displays all the books currently in the library.
     */
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
}

// A simple Book class to represent a book with a title and author
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