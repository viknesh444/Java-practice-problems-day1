import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter years of experience:");
        int exp = sc.nextInt();

        double bonus;

        if (exp > 5) {
            bonus = salary * 0.20;
        } else {
            bonus = salary * 0.10;
        }

        double finalSalary = salary + bonus;

        System.out.println("Final Salary = " + finalSalary);
    }
}