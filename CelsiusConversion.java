// . Celsius to Fahrenheit Conversion
// Write a program that takes the temperature in Celsius as input and converts
// it to Fahrenheit using the formula:
// Fahrenheit = (Celsius * 9/5) + 32.

import java.util.*;
public class CelsiusConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
        }
        }
