public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    String fileType;

    public EBook(String ISBN, String title, String author, String fileType) {
        super(ISBN, title, author);
        this.fileType = fileType;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + 
getAuthor() + ", File Type: " + fileType);
    }
}

