package binarysearch;

class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 4, 5, 6, 7 };
        int target = 8;
        System.out.println(findEle(numbers, target));
    }

    static int findEle(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;

            if (target > arr[mid])
                start = mid + 1;
            if (target < arr[mid])
                end = mid - 1;
        }

        return -1;
    }
}
