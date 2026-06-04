import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase amount:");
        double amount = sc.nextDouble();

        double finalAmount;

        if (amount > 5000) {
            finalAmount = amount - (amount * 0.20);
        } else if (amount > 2000) {
            finalAmount = amount - (amount * 0.10);
        } else {
            finalAmount = amount;
        }

        System.out.println("Final Payable Amount = " + finalAmount);
    }
}