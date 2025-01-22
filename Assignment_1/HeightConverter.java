// Program to convert height from centimeters to feet and inches
import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert to feet and inches
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display result
        System.out.println("Your height in cm is " + heightCm +
                           " while in feet is " + feet + " and inches is " + inches);
    }
}


