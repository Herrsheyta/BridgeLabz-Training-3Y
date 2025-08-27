//3. Power Calculation
// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or
// conditionals

import java.util.*;
public class Power_calculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
            }
            System.out.println(base + " raised to the power of " + exponent + " is " +
            result);
            }
            }
            
