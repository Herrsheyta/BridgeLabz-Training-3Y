// 5. Convert Kilometers to Miles
// Write a program that takes the distance in kilometers as input from the user
// and converts it into miles using the formula:
// Miles = Kilometers * 0.621371.
import java.util.*;
public class Km_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles");
        }
    
}
