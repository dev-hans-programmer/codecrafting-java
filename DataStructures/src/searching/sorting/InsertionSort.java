package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = { 2, 10, 15, 6, 9 };
        insertionSort(numbers);
        System.err.println(Arrays.toString(numbers));
    }

    static void insertionSort(int[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            for (j = i - 1; j >= 0 && temp < arr[j]; j--)
                arr[j + 1] = arr[j];
            arr[j + 1] = temp;

        }
    }
}
