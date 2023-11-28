package binarysearch.leetcode;

/**
 * 744. Find Smallest Letter Greater Than Target :
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 * You are given an array of characters letters that is sorted in non-decreasing
 * order, and a character target. There are at least two different characters in
 * letters.
 * 
 * Return the smallest character in letters that is lexicographically greater
 * than target. If such a character does not exist, return the first character
 * in letters.
 */

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = { 'x', 'x', 'y', 'y' };
        char target = 'z';
        System.out.println(nextGreatestLetter(letters, target));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target < letters[mid])
                right = mid - 1;
            else
                left = mid + 1;

        }

        return letters[left % letters.length];

    }
}
