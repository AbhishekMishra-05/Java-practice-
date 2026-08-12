// import java.util.*;
// public class SimpleClaculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         try {
//             int a = sc.nextInt();
//             System.out.println("Enter the second number: ");
//             int b = sc.nextInt();
//             System.out.println("Enter the operator: ");
//             System.out.println("+,-,*,/,%");
//             String operator = sc.next();

//             if (b == 0 && operator.equals("/")) {
//                 System.out.println("denominator cannot be zero");
//                 return;
//             }
//             if (b == 0 && operator.equals("%")) {
//                 System.out.println("denominator cannot be zero");
//                 return;
//             }
//             if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")
//                     && !operator.equals("%")) {
//                 System.out.println("Please enter a valid operator");
//                 return;
//             }
//             if (operator.equals("+")) {
//                 System.out.println("The sum is: " + (a + b));
//             } else if (operator.equals("-")) {
//                 System.out.println("The difference is: " + (a - b));
//             } else if (operator.equals("*")) {
//                 System.out.println("The product of the number  is: " + (a * b));
//             } else if (operator.equals("/")) {
//                 System.out.println("The quotient is: " + (a / b));
//             } else if (operator.equals("%")) {
//                 System.out.println("The remainder is: " + (a % b));
//             }
//         } catch (InputMismatchException e) {
//             System.out.println("Please enter a valid number");
//         } finally {
//             sc.close();
//         }
//     }
// }

import java.util.*;
public class SimpleClaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        try {
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println("Enter the operator: ");
            System.out.println("+,-,*,/,%");
            char operator = sc.next().charAt(0);
            if (b == 0 && (operator == '/' || operator == '%')) {
                System.out.println("please enter the valid dinominator.");
                return;
            }
            switch (operator) {
                case '+':
                    System.out.println("The sum of the number is: " + (a + b));
                    break;
                case '-':
                    System.out.println("The difference of the number is: " + (a - b));
                    break;
                case '*':
                    System.out.println("The product of the number is: " + (a * b));
                    break;
                case '/':
                    System.out.println("The quotient of the number is: " + (a / b));
                    break;
                case '%':
                    System.out.println("The remainder of the number is: " + (a % b));
                    break;
                default:
                    System.out.println("Inavlid operator");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("please enter the valid input");
        } finally {
            sc.close();
        }
    }
}
