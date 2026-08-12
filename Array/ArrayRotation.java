package Array;

import java.util.*;

public class ArrayRotation {

    void left_rotate_one(int[] arr, int size) {

        if (size <= 1) {
            System.out.println("Array is too small to rotate");
            return;
        }
        int temp = arr[0];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = temp;
    }

    void right_rotate_one(int[] arr, int size) {

        if (size <= 1) {
            System.out.println("Array is too small to rotate");
            return;
        }

        int temp = arr[size - 1];

        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void left_rotation_by_k(int[] arr, int size, int k) {

        if (size <= 1) {
            System.out.println("Array is too small to rotate");
            return;
        }
        k = k % size;
        if (k == 0) {
            System.out.println("No rotation needed as k is 0 or a multiple of size");
            return;
        }

        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);
        reverse(arr, 0, size - 1);
    }

    void right_rotation_by_k(int[] arr, int size, int k) {

        if (size <= 1) {
            System.out.println("Array is too small to rotate");
            return;
        }
        k = k % size;
        if (k == 0) {
            System.out.println("No rotation needed as k is 0 or a multiple of size");
            return;
        }

        reverse(arr, 0, size - 1 - k);
        reverse(arr, size - k, size - 1);
        reverse(arr, 0, size - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the array: ");
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

        ArrayRotation rotation = new ArrayRotation();

        while (true) {
            System.out.println("Enter your choice:  ");
            System.out.println("1. Left Rotate by 1");
            System.out.println("2. Right Rotate by 1 ");
            System.out.println("3. Left Rotate by k positions");
            System.out.println("4. Right Rotate by k positions");
            System.out.println("5. Exit");
            System.out.println("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    rotation.left_rotate_one(arr, size);
                    break;

                case 2:
                    rotation.right_rotate_one(arr, size);
                    break;

                case 3:
                    System.out.println("Enter the value of k: ");
                    int k = sc.nextInt();
                    rotation.left_rotation_by_k(arr, size, k);
                    break;

                case 4:
                    System.out.println("Enter the value of k: ");
                    k = sc.nextInt();
                    rotation.right_rotation_by_k(arr, size, k);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            System.out.print("Array after rotation: ");
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
