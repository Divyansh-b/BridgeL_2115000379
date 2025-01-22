// Program to calculate the area of a triangle
import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user for base and height
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculate area
        double area = 0.5 * base * height;

        // Display result
        System.out.println("The area of the triangle is " + area + " square cm.");
    }
}


