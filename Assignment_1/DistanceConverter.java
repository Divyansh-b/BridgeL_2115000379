class DistanceConverter {
    public static void main(String[] args) {
        // Declare variable for distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double milesPerKm = 1.6;

        // Calculate distance in miles
        double miles = kilometers / milesPerKm;

        // Display result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

