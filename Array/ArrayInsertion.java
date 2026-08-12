package Array;

import java.util.*;

public class ArrayInsertion {

    int Beginning(int size, int[] arr, int num) {

        if (size >= arr.length) {
            System.out.print("no space available");
            return size;
        }
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = num;
        size++;
        return size;
    }

    int end(int size, int[] arr, int num) {

        if (size >= arr.length) {
            System.out.print("no space available");
            return size;
        } else {
            arr[size] = num;
            size++;
        }
        return size;

    }

    int anyposition(int size, int[] arr, int num, Scanner sc) {
        if (size >= arr.length) {
            System.out.println("no space available");
            return size;
        }
        System.out.println("Enter the index to insert element: ");
        int index = sc.nextInt();

        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return size;
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = num;
        size++;
        return size;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of an array: ");
        int capacity = sc.nextInt();

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        if (size > capacity) {
            System.out.print("Invalid size. size cannot be greater than capacity");
            sc.close();
            return;
        }

        int[] arr = new int[capacity];

        System.out.print("Enter the elements to insert in an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The original array is: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        ArrayInsertion a = new ArrayInsertion();

        while (true) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Any Position");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            int num;

            switch (choice) {

                case 1:
                    System.out.print("Enter the element to insert: ");
                    num = sc.nextInt();
                    size = a.Beginning(size, arr, num);
                    break;

                case 2:
                    System.out.print("Enter the element to insert: ");
                    num = sc.nextInt();
                    size = a.end(size, arr, num);
                    break;

                case 3:
                    System.out.print("Enter the element to insert: ");
                    num = sc.nextInt();
                    size = a.anyposition(size, arr, num, sc);
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            System.out.print("The array after insertion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}