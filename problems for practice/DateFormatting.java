import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + today.format(fmt1));
        System.out.println("Format 2: " + today.format(fmt2));
        System.out.println("Format 3: " + today.format(fmt3));
    }
}
