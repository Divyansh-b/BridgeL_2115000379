// Program to swap two numbers
import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("Before swapping: Number1 = " + number1 + ", Number2 = " + number2);

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the swapped numbers
        System.out.println("After swapping: Number1 = " + number1 + ", Number2 = " + number2);
    }
}


