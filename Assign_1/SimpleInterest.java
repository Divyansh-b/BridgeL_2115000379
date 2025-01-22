
import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Taking inputs from the user
    System.out.print("Enter the Principal amount: ");
    double principal = scanner.nextDouble();

    System.out.print("Enter the Rate of interest: ");
    double rate = scanner.nextDouble();

    System.out.print("Enter the Time period in years: ");
    double time = scanner.nextDouble();

    // Calculating simple interest
    double simpleInterest = (principal * rate * time) / 100;

    // Displaying the result
    System.out.println("The Simple Interest is: " + simpleInterest);
    scanner.close();
  }
}