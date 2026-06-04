import java.util.Scanner;

public class prob11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin123";

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter password:");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
                return;
            } else {
                System.out.println("Wrong Password");
            }
        }

        System.out.println("Account Locked");
    }
}