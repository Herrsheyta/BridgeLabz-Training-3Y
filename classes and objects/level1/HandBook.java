public class HandBook {
    String subject;
    int pages;

    HandBook(String subject, int pages) {
        this.subject = subject;
        this.pages = pages;
    }

    void display() {
        System.out.println("Subject: " + subject + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        HandBook hb = new HandBook("Java", 300);
        hb.display();
    }
}
