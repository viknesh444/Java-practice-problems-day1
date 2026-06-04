import java.util.Scanner;

public class prob8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password:");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (password.length() >= 8 && hasUpper && hasDigit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}