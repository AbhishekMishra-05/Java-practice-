import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        try {
            year = sc.nextInt();
            if (year % 400 == 0) {
                System.out.println("The year is a leap year");
            } else if (year % 100 == 0) {
                System.out.println("The year is not a leap year");
            } else if (year % 4 == 0) {
                System.out.println("The year is a leap year");
            } else {
                System.out.println("The year is not a leap year");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid year");
        } finally {
            sc.close();
        }
    }
}
