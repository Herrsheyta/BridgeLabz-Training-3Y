import java.util.*;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    Library(String name) {
        this.name = name;
    }
    void addBook(Book b) {
        books.add(b);
    }
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");
        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");
        l1.addBook(b1);
        l2.addBook(b1);
        l2.addBook(b2);
        l1.showBooks();
        l2.showBooks();
    }
}

