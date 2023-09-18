package linearsearch.leetcode;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] { 12, 3457, 2, 6, 7896 }));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int number : nums)
            if (isEvenDigit(number))
                count++;

        return count;
    }

    static boolean isEvenDigit(int num) {
        return countDigits(num) % 2 == 0;
        // return String.valueOf(num).toCharArray().length % 2 == 0;
    }

    static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
