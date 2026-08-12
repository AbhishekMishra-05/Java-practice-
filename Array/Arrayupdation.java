package Array;

import java.util.*;

class Arrayupdation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements to insert in an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The elements present in  an array are: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.println("Enter the index to update element: ");
        int index = sc.nextInt();

        System.out.println("Enter the element to update: ");
        int num = sc.nextInt();

        if (index >= 0 && index < arr.length ) {
            arr[index] = num;
        }else{
            System.out.println("Invalid index.");
        }
        System.out.print("Updated array is: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}