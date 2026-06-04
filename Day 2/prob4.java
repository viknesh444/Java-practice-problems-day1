import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account balance:");
        int balance = sc.nextInt();

        System.out.println("Enter withdrawal amount:");
        int withdraw = sc.nextInt();

        if (withdraw % 100 == 0 && (balance - withdraw) >= 1000) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Withdrawal Failed");
        }
    }
}