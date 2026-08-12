package Array;

import java.util.*;

public class checkArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of the array: ");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.print("Capacity cannot be negative");
            sc.close();
            return;
        }

        int[] arr = new int[capacity];

        System.out.print("Enter the size of an arry: ");
        int size = sc.nextInt();

        if (size < 0 || size > capacity) {
            System.out.println("Invalid size. Please enter a size between 0 and " + capacity);
            sc.close();
            return;
        }

        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array is: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        boolean sorted = true;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Array sorted.");
        } else {
            System.out.println("Not sorted.");
        }

        sc.close();
    }
}
