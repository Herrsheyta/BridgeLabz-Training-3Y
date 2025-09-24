public class Library {
    private String bookTitle;
    private String author;
    private boolean available;

    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(bookTitle + " borrowed.");
        } else {
            System.out.println(bookTitle + " not available.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(bookTitle + " returned.");
    }

    public void display() {
        System.out.println("Book: " + bookTitle + ", Author: " + author + ", Available: 
" + available);
    }
}

