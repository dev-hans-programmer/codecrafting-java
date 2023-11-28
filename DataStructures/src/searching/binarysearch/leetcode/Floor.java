package binarysearch.leetcode;

// Greatest number smaller or equals to the target
public class Floor {
    public static void main(String[] args) {
        int[] numbers = { 1, 5, 9, 13 };
        int target = 8;
        System.out.println(findEle(numbers, target));
    }

    static int findEle(int[] numbers, int target) {
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
        return end;
    }
}
