import java.util.*;

class largest {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number: ");
        try {
            a = sc.nextInt();
            System.out.println("Enter the second number: ");
            b = sc.nextInt();
            System.out.println("Enter the third number: ");
            c = sc.nextInt();
            if (a >= b && a >= c) {
                System.out.println("The largets number is: " + a);
            } else if (b >= a && b >= c) {
                System.out.println("The largest number is: " + b);
            } else if (c >= a && c >= b) {
                System.out.println("The largest number is: " + c);
            } else if (a == b && b == c) {
                System.out.println("The numbers are equal");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        } finally {
            sc.close();
        }

    }
}