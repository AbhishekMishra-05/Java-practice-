import java.util.*;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        try {
            int num = sc.nextInt();
            int reverse = 0;
            while (num != 0) {
                 int last = num % 10;
                 reverse = reverse*10 + last;
                 num = num/10;            
                }
                System.out.println(" The reversed numbers are: " + reverse);
            
        } catch (InputMismatchException e) {
            System.out.println("Please enetr the valid number.");
        } finally {
            sc.close();
        }

    }

}
