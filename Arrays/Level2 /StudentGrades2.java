import java.util.Scanner;

public class StudentGrades2 {
    
    // Function to get grade from percentage
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks [student][0=Physics,1=Chemistry,2=Maths]
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print(subject + " marks (0-100): ");
                    marks[i][j] = sc.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            grade[i] = getGrade(percentage[i]);
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
}
