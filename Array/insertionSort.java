package Array;

import java.util.*;

public class insertionSort {

    void insertion(int[] arr) {
        int i = 1;
        
        for (i = 1; i < arr.length; i++) {
            int j = i - 1;
             int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Sorted array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("Enter elements to insert inside an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements present in an array are: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        insertionSort sort = new insertionSort();
        sort.insertion(arr);
        sc.close();
    }
}
