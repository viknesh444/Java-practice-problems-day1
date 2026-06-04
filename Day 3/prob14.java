import java.util.Scanner;

public class prob14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 5;

        while (seats > 0) {

            System.out.println("Available seats: " + seats);
            System.out.println("Book 1 seat? (yes/no)");

            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                seats--;
                System.out.println("Seat Booked");
            } else {
                break;
            }
        }

        if (seats == 0) {
            System.out.println("Booking Closed");
        }
    }
}