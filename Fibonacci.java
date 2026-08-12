import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci series: ");
        try {
            int num = sc.nextInt();
            int first = 0;
            int second = 1;
            if (num < 0) {
                System.out.println("please enter a non negative number.");
                return;
            }
            while (first <= num) {
                System.out.println(first);
                int next = first + second;
                first = second;
                second = next;
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter the valid input");
        } finally {
            sc.close();
        }
    }
}
