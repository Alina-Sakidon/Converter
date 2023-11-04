import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers:");
        double distanceInKm= sc.nextDouble();

        System.out.println(distanceInKm + " km = " + convertToMiles(distanceInKm) + " miles");
    }

    private static double convertToMiles(double distanceInKm) {
        return distanceInKm * 0.621371;
    }
}
