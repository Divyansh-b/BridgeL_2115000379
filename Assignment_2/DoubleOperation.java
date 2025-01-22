// Program to perform double operations
import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter the value of y: ");
        double y = input.nextDouble();

        System.out.print("Enter the value of z: ");
        double z = input.nextDouble();

        double result1 = x + y * z;
        double result2 = x * y + z;
        double result3 = z + x / y;

        System.out.println("The results of the operations are: ");
        System.out.println("x + y * z = " + result1);
        System.out.println("x * y + z = " + result2);
        System.out.println("z + x / y = " + result3);
    }
}




