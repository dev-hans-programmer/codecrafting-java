package stack;

import java.util.Arrays;

public class CustomStack {
    private int[] items = new int[5];

    private int count;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop() {

        if (isEmpty())
            throw new IllegalStateException();

        var top = items[count - 1];
        count--;
        return top;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
