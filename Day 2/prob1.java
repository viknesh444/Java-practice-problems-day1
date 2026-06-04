import java.util.Scanner;
public class prob1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter monthly salary:");
        int salary = sc.nextInt();
        System.out.println("Do you already have an active loan? (true/false)");
        boolean activeLoan = sc.nextBoolean();

        if (age >= 21 && salary >= 30000 && activeLoan == false) {
            System.out.println("Eligible for Home Loan");
        } else {
            System.out.println("Not Eligible for Home Loan");
        }
    }
}