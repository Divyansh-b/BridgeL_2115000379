// Program to convert Fahrenheit to Celsius
import java.util.Scanner;

class ReverseTemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature " + fahrenheit + "°F is equal to " + celsius + "°C.");
    }
}
