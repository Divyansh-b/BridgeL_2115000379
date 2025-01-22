import java.util.Scanner;

class TravelComputationWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for name and cities
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = input.nextLine();

        // Take input for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take input for time taken in minutes
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Compute total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display the travel details
        System.out.println("\nTravel Details:");
        System.out.println("The total distance traveled by " + name + " from " + fromCity + 
                           " to " + toCity + " via " + viaCity + " is " + totalDistance + 
                           " miles and the total time taken is " + totalTime + " minutes.");
    }
}
