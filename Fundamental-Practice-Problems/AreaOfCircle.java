// 4. Area of a Circle
// Write a program to calculate the area of a circle. Take the radius as input
// and use the formula:
// Area = π * radius^2.
 import java.util.*;
 public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
        }
 }
