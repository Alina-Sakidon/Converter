import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter distance in miles:");
        double distanceInMiles = sc.nextDouble();

        System.out.println(distanceInMiles + " miles = " + convertToKm(distanceInMiles) + " km");
    }

    private static double convertToKm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }
}
