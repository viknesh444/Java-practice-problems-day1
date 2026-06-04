import java.util.Scanner;

public class prob15{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Is server running? (true/false)");
        boolean server = sc.nextBoolean();

        System.out.println("Is database connected? (true/false)");
        boolean database = sc.nextBoolean();

        if (!server) {
            System.out.println("Critical Error");
        } else if (!database) {
            System.out.println("Database Error");
        } else {
            System.out.println("System Running Normally");
        }
    }
}