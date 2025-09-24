import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZonesDemo {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy HH:mm:ss z");

        System.out.println("GMT: " + gmt.format(fmt));
        System.out.println("IST: " + ist.format(fmt));
        System.out.println("PST: " + pst.format(fmt));
    }
}
