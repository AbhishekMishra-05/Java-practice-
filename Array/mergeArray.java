package Array;

import java.util.*;

class mergeArray {

    static int[] concatArray(int[] arr1, int[] arr2, int size1, int size2) {

        int[] mergedArray = new int[size1 + size2];

        // Copy arr1
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        return mergedArray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of array1: ");
        int capacity1 = sc.nextInt();

        System.out.print("Enter the capacity of array2: ");
        int capacity2 = sc.nextInt();

        if (capacity1 <= 0 || capacity2 <= 0) {
            System.out.println("Capacity of an array must be greater than zero.");
            sc.close();
            return;
        }

        System.out.print("Enter the size of arr1: ");
        int size1 = sc.nextInt();

        System.out.print("Enter the size of arr2: ");
        int size2 = sc.nextInt();

        if (size1 < 0 || size1 > capacity1 ||
                size2 < 0 || size2 > capacity2) {

            System.out.println("Size cannot be greater than capacity.");
            sc.close();
            return;
        }

        int[] arr1 = new int[capacity1];
        int[] arr2 = new int[capacity2];

        System.out.print("Enter the elements of arr1: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the elements of arr2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray ;

        while (true) {

            System.out.println("Enter your choice: ");
            System.out.println("1.Concat array");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mergedArray = concatArray(arr1, arr2, size1, size2);
                    break;
                default:
                    System.out.println("Enter the valid choice");
                    continue;
            }
            System.out.println("Concatenated array:");

            for (int i = 0; i < mergedArray.length; i++) {
                System.out.print(mergedArray[i] + " ");
            }
            break;
        }
        sc.close();
    }
}