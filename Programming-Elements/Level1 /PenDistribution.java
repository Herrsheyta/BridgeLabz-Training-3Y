import java.util.Scanner;

public class PenDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total number of pens: ");
        int pens = input.nextInt();

        System.out.print("Enter total number of students: ");
        int students = input.nextInt();

        int pensPerStudent = pens / students;
        int remaining = pens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remaining);
    }
}
