// 2. Perimeter of a Rectangle
// Write a program to calculate the perimeter of a rectangle. Take the length
// and width as inputs and use the formula:
// Perimeter = 2 * (length + width).

import java.util.*;
public class Perimetre_Rectangle{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
        }
