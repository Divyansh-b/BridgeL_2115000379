// Program to calculate the discount amount and final discounted fee
class DiscountCalculator {
    public static void main(String[] args) {
        // Declare variables for fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
