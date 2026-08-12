package Array;

import java.util.*;

public class MergeSort {

    void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // left halves
        mergeSort(arr, left, mid);

        // right halves
        mergeSort(arr, mid + 1, right);

        // sorted array
        merge(arr, left, mid, right);

    }

    void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftarr[i] < rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements to insert in an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The elements present in an array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        MergeSort m = new MergeSort();
        m.mergeSort(arr, 0, arr.length - 1);

        System.out.println();

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
