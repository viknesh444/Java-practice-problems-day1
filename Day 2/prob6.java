import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double p = sc.nextDouble();

        System.out.println("Enter annual interest rate:");
        double r = sc.nextDouble();

        System.out.println("Enter number of years:");
        int n = sc.nextInt();

        double amount = p * Math.pow((1 + r / 100), n);

        System.out.println("Final Amount = " + amount);
    }
}