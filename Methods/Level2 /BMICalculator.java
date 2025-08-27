import java.util.Scanner;

public class BMICalculator {
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;  // convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI Status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array for 10 people: [weight, height, BMI]
        double[][] data = new double[10][3];
        String[] status = new String[10];

        // Take input from user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();

            // Store weight and height
            data[i][0] = weight;
            data[i][1] = height;

            // Calculate BMI
            double bmi = calculateBMI(weight, height);
            data[i][2] = bmi;

            // Get BMI status
            status[i] = getBMIStatus(bmi);
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}
