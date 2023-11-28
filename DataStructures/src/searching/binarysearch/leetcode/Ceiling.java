package binarysearch.leetcode;
// Find the target element and if not then find the smallest element greater 

// or equals to target element //  Search Insert Position

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };
        int target = 2;
        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] numbers, int target) {
        if (target > numbers[numbers.length - 1])
            return -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == numbers[mid])
                return mid;

            if (target > numbers[mid])
                start = mid + 1;
            else if (target < numbers[mid])
                end = mid - 1;
        }
        return start;
    }
}
