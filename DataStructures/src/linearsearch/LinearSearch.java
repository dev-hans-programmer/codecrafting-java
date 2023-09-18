package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(searchItem(numbers, 6));
    }

    /**
     * 
     * @param numbers[]
     * @param number
     * @return int
     *         Time complexity: O(1)
     *         O(n)
     */
    static int searchItem(int[] numbers, int number) {
        int length = numbers.length;
        if (length <= 0)
            return -1;
        for (int i = 0; i < length; i++)
            if (numbers[i] == number)
                return i;
        return -1;
    }
}
