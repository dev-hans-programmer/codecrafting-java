package queue;

import java.util.Arrays;

class ArrayQueue {
    public int[] items;
    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    // Whenever the rear reaches the end,
    // it should point to the begining if we have
    // empty space
    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length; // circular array
        count++;
    }

    public int dequeue() {
        var top = items[front];
        items[front] = 0;
        front = (front + 1) % items.length; // circular array
        count--;
        return top;

    }

    public int peek() {
        return items[front];
    }

    public boolean isFull() {
        return items.length == count;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}