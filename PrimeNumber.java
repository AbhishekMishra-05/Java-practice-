// import java.util.*;

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to find: ");
//         try {
//             int num = sc.nextInt();
//             if (num <= 1) {
//                 System.out.println(" Not a prime number: " + num);
//                 return;
//             }
//             boolean isprime = true;
//             for (int i = 2; i < num; i++) {
//                 if (num % i == 0) {
//                     isprime = false;
//                     break;
//                 }
//             }
//                 if (isprime) {
//                     System.out.println("prime number:" + num);
//                 } else {
//                     System.out.println("Not a prime number:" + num);
//                 }
//         } catch (InputMismatchException e) {
//             System.out.println("Please enter valid input.");
//         } finally {
//             sc.close();
//         }
//     }
// }


// prime number in range 

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        try {
            int start = sc.nextInt();
            System.out.println("Enter the end number: ");
            int end = sc.nextInt();
            for (int i = start; i < end; i++) {
                boolean isprime = true;
                if(i<=1){
                    continue;
                }
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isprime = false;
                        break;
                    }
                }
                    if (isprime) {
                        System.out.println("Prime number: " + i);
                    } else {
                        System.out.println("Not a prime: "+i);
                    }
            }
        } catch (InputMismatchException e) {
            System.out.println("PLease enter valid input");
        } finally {
            sc.close();
        }
    }
}