import java.util.Scanner;

class DivideChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for number of chocolates and children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates per child and remainder
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("Each child gets " + chocolatesPerChild + " chocolates.");
        System.out.println("The number of remaining chocolates is " + remainingChocolates + ".");
    }
}
