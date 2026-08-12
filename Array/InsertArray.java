package Array;

import java.util.*;

public class InsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of element to insert: ");
        int size = sc.nextInt();
        int[] insert = new int[size];
        System.out.print("Enter the elements to insert in array: ");
        for (int i = 0; i < size; i++) {
            insert[i] = sc.nextInt();
        }
        System.out.print("The elements present in the array are: ");
        for (int j = 0; j < insert.length; j++) {
            System.out.print(insert[j] + " ");
        }
        System.out.println();
        System.out.println("The length of the arrray is: " + insert.length);

        System.out.print("The reversed array is: ");
        for (int k = size - 1; k >= 0; k--) {
            System.out.print(insert[k] + " ");
        }
        System.out.println();
        sc.close();
    }

}
