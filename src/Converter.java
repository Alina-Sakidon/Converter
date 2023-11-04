import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Pleas enter distance in miles:");
        double distanceInMiles = sc.nextDouble();

        System.out.println(distanceInMiles + " miles = " + convertToKm(distanceInMiles) + " km");
        System.out.print("Enter distance in kilometers:");
        double distanceInKm = sc.nextDouble();

        System.out.println(distanceInKm + " km = " + convertToMiles(distanceInKm) + " miles");
    }

    private static double convertToKm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }

    private static double convertToMiles(double distanceInKm) {
        return distanceInKm * 0.621371;
    }
}
