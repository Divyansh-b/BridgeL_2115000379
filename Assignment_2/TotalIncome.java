// Program to calculate total income
import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary in INR: ");
        double salary = input.nextDouble();

        System.out.print("Enter bonus in INR: ");
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + ", the bonus is INR " + bonus +
                           ", and the total income is INR " + totalIncome + ".");
    }
}

