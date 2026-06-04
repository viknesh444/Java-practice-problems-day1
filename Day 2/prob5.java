import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double p = sc.nextDouble();

        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();

        System.out.println("Enter number of years:");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;
        double total = p + si;

        System.out.println("Simple Interest = " + si);
        System.out.println("Total Amount = " + total);
    }
}