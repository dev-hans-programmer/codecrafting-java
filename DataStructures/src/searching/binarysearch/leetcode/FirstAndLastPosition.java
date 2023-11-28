package binarysearch.leetcode;

import java.util.Arrays;

/**
 * 34. Find First and Last Position of Element in Sorted Array:
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] numbers = { 5, 7, 7, 8, 8, 10 };
        int target = 10;
        int[] targetIndexes = { -1, -1 };
        targetIndexes[0] = getPosition(numbers, target, true);
        if (targetIndexes[0] != -1)
            targetIndexes[1] = getPosition(numbers, target, false);
        System.out.println(Arrays.toString(targetIndexes));
    }

    static int getPosition(int[] numbers, int target, boolean isLeft) {
        int index = -1;
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == numbers[mid]) {
                index = mid;

                if (isLeft) {
                    end = mid - 1;
                } else
                    start = mid + 1;

            } else if (target > numbers[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }

        }

        return index;

    }
}
