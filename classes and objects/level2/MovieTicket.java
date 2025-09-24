public class MovieTicket {
    String movieName;
    int price;

    MovieTicket(String movieName, int price) {
        this.movieName = movieName;
        this.price = price;
    }

    void showTicket() {
        System.out.println("Movie: " + movieName + ", Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 250);
        ticket.showTicket();
    }
}
