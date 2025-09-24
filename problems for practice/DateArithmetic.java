import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Final date after operations: " + newDate.format(DateTimeFormatter.ISO_DATE));
        sc.close();
    }
}
