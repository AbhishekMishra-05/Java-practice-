package Array;

import java.util.*;

public class ArrayDeletion {

    int deletebeginning(int[] arr, int size) {

        if (size == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }

    int delete_end(int[] arr, int size) {

        if (size == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        size--;
        return size;
    }

    int delete_anyposition(int[] arr, int size, Scanner sc) {
        if (size == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        System.out.print("Enter the index to delete element: ");
        int index = sc.nextInt();
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return size;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }

    int delete_by_value(int[] arr, int size, Scanner sc) {

        if (size == 0) {
            System.out.println("Array is empty");
            return size;
        }
        System.out.println("Enter the value to delete: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                found = true;
                System.out.println("Element found at index: " + i);

                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                System.out.println("Element deleted successfully.");
                size--;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
        return size;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of an array: ");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.println("Invalid capacity");
            sc.close();
            return;
        }

        int[] arr = new int[capacity];

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        if (size > capacity || size < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }

        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The original array is: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        ArrayDeletion AD = new ArrayDeletion();

        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Delete from beginning");
            System.out.println("2. Delete from end");
            System.out.println("3. Delete from any position");
            System.out.println("4. Delete by value");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    size = AD.deletebeginning(arr, size);
                    break;
                case 2:
                    size = AD.delete_end(arr, size);
                    break;
                case 3:
                    size = AD.delete_anyposition(arr, size, sc);
                    break;
                case 4:
                    size = AD.delete_by_value(arr, size, sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            System.out.print("The array after deletion is: ");
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }

}
