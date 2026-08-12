import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        try {
            int first = sc.nextInt();
            System.out.println("Enter the Second number: ");
            int second = sc.nextInt();
            int smaller;
            int gcd = 1;
            int i = 1;

            if (first < second) {
                smaller = first;
            } else {
                smaller = second;
            }
            if (first == 0 && second == 0) {
                System.out.println("GCD is not defined");
                return;
            } else if (first == 0) {
                System.out.println("The GCD of the number is: " + second);
                return;
            } else if (second == 0) {
                System.out.println("The GCD of the number is: " + first);
                return;
            } else if (first < 0 || second < 0) {
                System.out.println("Invalid number.");
                return;
            }
            while (i <= smaller) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
                i++;
            }
            System.out.println("The GCD of the given nuber are: " + gcd);
        } catch (InputMismatchException e) {
            System.out.println("Please enter the valid input");
        } finally {
            sc.close();
        }
    }
}
