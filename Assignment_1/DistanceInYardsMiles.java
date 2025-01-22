// Program to find distance in yards and miles from feet
import java.util.Scanner;

class DistanceInYardsMiles {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Display result
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
