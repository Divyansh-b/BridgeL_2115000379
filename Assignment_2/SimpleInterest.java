import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for principal, rate, and time
        System.out.print("Enter the Principal amount (INR): ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of interest (%): ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time period (years): ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is INR " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + "% and Time " + time + " years.");
    }
}
