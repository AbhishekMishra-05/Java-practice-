package Array;

import java.util.*;

public class RemoveDuplicate {
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

        Set<Integer> unique = new HashSet<>();
        Set<Integer>duplicate = new HashSet<>();

        for (int i= 0; i< size; i++){
           if(unique.contains(arr[i])){
            duplicate.add(arr[i]);
           }else{
            unique.add(arr[i]);
           }
        }
        System.out.println("Unique elements: " + unique);
        System.out.println("Duplicate elements: " + duplicate);

        sc.close();
    }
}
