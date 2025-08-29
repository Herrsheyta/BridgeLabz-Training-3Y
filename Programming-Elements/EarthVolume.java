import java.util.Scanner;

public class EarthVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of Earth in kilometers: ");
        double radiusKm = input.nextDouble();

        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm / 1.6; // convert km to miles
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
