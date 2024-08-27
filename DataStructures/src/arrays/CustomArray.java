package arrays;

public class CustomArray {
    private int size;
    private int lastIndex = -1;
    private int[] arr;

    public CustomArray(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void insert(int item) {
        if (lastIndex == this.size - 1)
            throw new ArrayIndexOutOfBoundsException();
        this.arr[++lastIndex] = item;
    }

    public void print() {
        for (int idx = 0; idx <= lastIndex; idx++)
            System.out.println(this.arr[idx] + " ");
    }

    public int indexOf(int item) {
        for (int idx = 0; idx <= lastIndex; idx++) {
            if (this.arr[idx] == item)
                return idx;
        }
        return -1;
    }

    public void removeAt(int index) {
        if (lastIndex == -1) {
            System.out.println("No more elements to delete");
            return;
        }
        for (int idx = index; idx < lastIndex; idx++) {
            int temp = this.arr[idx];
            this.arr[idx] = this.arr[idx + 1];
            this.arr[idx + 1] = temp;
        }
        this.lastIndex--;
    }
}
