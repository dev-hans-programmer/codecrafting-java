package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = { 38, 90, 47, 69, 52, 88, 71, 18, 20 };

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = getSmallestNumberIndex(arr, i);

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }

    static int getSmallestNumberIndex(int[] arr, int startIndex) {
        int smallest = arr[startIndex];
        int desiredIndex = startIndex;

        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                desiredIndex = i;
            }
        }

        return desiredIndex;

    }
}
