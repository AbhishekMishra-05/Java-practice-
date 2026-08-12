// import java.util.*;

// public class SumOfNatural {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the natural number: ");
//         try {
//             int num = sc.nextInt();
//             if (num <=0){
//                 System.out.println("Enter the correct number.");
//                 return;
//             }
//             int sum = (num *(num+1) / 2);
//             System.out.println("The sum of natural number is: "+sum);
//         } catch (InputMismatchException e) {
//             System.out.println(" Enter the valid input");
//         } finally{
//             sc.close();
//         }

//     }
// }


import java.util.*;

public class SumOfNatural {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        try {
            int num = sc.nextInt();
            if (num <=0){
                System.out.println("Enter the correct number.");
                return;
            }
            int sum =0;
            for(int i = 1; i<=num; i++){
                sum = sum +i; 
            }
            System.out.println("The sum of natural number is: "+sum);
        } catch (InputMismatchException e) {
            System.out.println(" Enter the valid input");
        } finally{
            sc.close();
        }

    }
}
