// 1. Calculate Simple Interest
// Write a program to calculate simple interest using the formula:
// Simple Interest = (Principal * Rate * Time) / 100.
// Take Principal, Rate, and Time as inputs from the user.

import java.util.*;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int principal, rate, time;
        double intrest;
        System.out.println("Enter the principal amount: ");
        principal = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        rate = sc.nextInt();
        System.out.println("Enter the time period: ");
        time = sc.nextInt();
        intrest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + intrest);

    }
}
