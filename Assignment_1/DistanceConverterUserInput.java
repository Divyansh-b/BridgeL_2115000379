// Program to convert user input distance in kilometers to miles
import java.util.Scanner;

class DistanceConverterUserInput {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Convert to miles
        double miles = kilometers / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}
