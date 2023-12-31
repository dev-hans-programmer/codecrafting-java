package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        System.out.println("Before sort " + Arrays.toString(numbers));
        sort(numbers);
        System.out.println("After sort " + Arrays.toString(numbers));
    }

    static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (!swapped)
                break;
        }
    }
}
