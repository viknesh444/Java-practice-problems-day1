import java.util.Scanner;

public class prob12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Free Entry");
            System.out.println("Amount = 0");
        } else if (age <= 18) {
            System.out.println("Child Ticket");
            System.out.println("Amount = 100");
        } else {
            System.out.println("Adult Ticket");
            System.out.println("Amount = 200");
        }
    }
}