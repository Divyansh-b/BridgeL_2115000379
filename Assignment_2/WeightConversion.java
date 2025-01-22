import java.util.Scanner;

class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Display the result
        System.out.println("The weight of the person is " + weightInPounds + " pounds and " + 
                           String.format("%.2f", weightInKilograms) + " kilograms.");
    }
}





