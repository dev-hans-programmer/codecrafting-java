package linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 10;
        System.out.println(Arrays.toString(searchItem(numbers, target)));
    }

    static int[] searchItem(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] == target)
                    return new int[] { row, col };
        return new int[] { -1, -1 };
    }
}
