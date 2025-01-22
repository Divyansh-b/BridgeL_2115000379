class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs for the sides of the triangular park
        System.out.print("Enter the length of the first side of the park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the park (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double totalDistanceToRun = 5000;

        // Calculate the number of rounds
        int rounds = (int) Math.ceil(totalDistanceToRun / perimeter);

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
