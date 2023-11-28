package binarysearch.leetcode;

/**
 * 
 * Write code to find the position of an element in an infinite sorted array
 * 
 */

// // this might throw array bound exception as we are considering the Finite
// array
// of example, but in an infinite array there shouldn't be any limit hence this
// solution is correct
public class PositionInfiniteSortedArray {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 }; // infinite array(lets assume)
        int target = 130;
        int[] indexes = findStartEnd(numbers, target);
        System.out.println(findIndex(numbers, target, indexes[0], indexes[1]));
    }

    static int[] findStartEnd(int[] numbers, int target) {
        int start = 0;
        int end = 1;

        while (numbers[end] < target) {
            start = end;
            end *= 2;
        }
        return new int[] { start, end };
    }

    static int findIndex(int[] numbers, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == numbers[mid])
                return mid;
            else if (target > numbers[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;

    }

}
