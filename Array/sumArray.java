package Array;

import java.util.*;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            int sum = 0;
            System.out.print("The elements of array are: ");
            for (int i = 0; i <= size - 1; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.print("The sum of the array is: " + sum);
            System.out.println();

            int avg = sum / size;
            System.out.println("The average of the array is: "+avg);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        sc.close();
    }

}
