package linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = { 10, 21, 1, 11, 13, 2 };
        System.out.println(findMin(nums));
    }

    static int findMin(int[] arr) {
        int start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < start)
                start = arr[i];
        }
        return start;
    }
}
