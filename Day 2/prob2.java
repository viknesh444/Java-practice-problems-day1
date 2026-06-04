import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mark:");
        int m1 = sc.nextInt();
        System.out.println("Enter Mark:");
        int m2 = sc.nextInt();
        System.out.println("Enter Mark:");
        int m3 = sc.nextInt();
        System.out.println(m1+m2+m3);
          double average = (m1 + m2 + m3) / 3.0;
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && average >= 50) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
        System.out.println("Average = " + average);
        
        
    }
}