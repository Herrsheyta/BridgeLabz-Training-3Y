import java.util.*;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Is this in Celsius (C) or Fahrenheit (F)? ");
        String type = sc.next();

        if (type.equalsIgnoreCase("C")) {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        }

        sc.close();
    }
}
