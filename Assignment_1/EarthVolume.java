// Program to compute the volume of Earth in cubic kilometers and miles
class EarthVolume {
    public static void main(String[] args) {
        // Declare constants for radius and conversion factor
        double radiusKm = 6378;
        double milesPerKm = 0.621371;
        
        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert to cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(milesPerKm, 3);

        // Display result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}


