// Program to calculate quotient and remainder
import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder +
                           " for the numbers " + number1 + " and " + number2 + ".");
    }
}


