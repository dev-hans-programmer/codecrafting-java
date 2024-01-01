package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        System.out.println("Before sort " + Arrays.toString(numbers));
        modifiedSort(numbers);
        System.out.println("After sort " + Arrays.toString(numbers));
    }

    static void sort(int[] arr) {
        int length = arr.length;

        for (int round = 0; round < length - 1; round++) {
            for (int j = 0; j < length - round - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    static void modifiedSort(int[] arr) {
        int length = arr.length;
        boolean swapped = false;

        for (int round = 0; round < length - 1; round++) {
            swapped = false;

            for (int j = 0; j < length - round - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            if (!swapped)
                return;
        }

    }
}
