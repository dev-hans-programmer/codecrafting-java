package linkedinList;

import java.util.NoSuchElementException;;

class Node {
    int data;
    Node ptr;

    public Node(int data, Node ptr) {
        this.data = data;
        this.ptr = ptr;
    }
}

public class CustomLinkedinList {
    Node start;
    private int count;

    public CustomLinkedinList() {
        start = null;
    }

    private boolean isEmpty() {
        return start == null;
    }

    public void addFirst(int data) {
        var node = new Node(data, null);

        if (isEmpty())
            start = node;
        else {
            node.ptr = start;
            start = node;
        }

        count++;

    }

    public void addLast(int data) {
        var node = new Node(data, null);

        if (isEmpty())
            addFirst(data);
        else {
            var temp = start;

            while (temp.ptr != null)
                temp = temp.ptr;

            temp.ptr = node;

        }
        count++;
    }

    public void addAfter(Node ref, int data) {
        var node = new Node(data, null);

        if (isEmpty())
            addFirst(data);
        else if (start.ptr == null) {
            addLast(data);
        } else {
            node.ptr = ref.ptr;
            ref.ptr = node;
        }
        count++;

    }

    public void traverse() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data);
            current = current.ptr;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public int indexOf(int data) {
        int index = 0;
        var current = start;
        while (current != null) {
            if (current.data == data)
                return index;
            current = current.ptr;
            index++;
        }
        return -1;

    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public Node find(int data) {
        if (isEmpty())
            return null;

        var temp = start;

        while (temp != null) {
            if (temp.data == data)
                return temp;
            temp = temp.ptr;
        }
        return null;

    }

    public void deleteFirst() {
        var current = start;
        if (isEmpty())
            throw new NoSuchElementException();
        current = start.ptr;
        start.ptr = null;
        start = current;
        count--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (start.ptr == null) {
            deleteFirst();
        } else {
            var current = start;
            while (current.ptr.ptr != null) {
                current = current.ptr;
            }
            current.ptr = null;
        }
        count--;
    }

    public int size() {
        return count;
    }

    public int[] toArray() {
        int[] arr = new int[count];
        int index = 0;
        var current = start;

        while (current != null) {
            arr[index++] = current.data;
            current = current.ptr;
        }
        return arr;

    }

    public void reverse() {
        Node previous = null;
        var current = start;

        while (current != null) {
            var next = current.ptr;
            current.ptr = previous;
            previous = current;
            current = next;
        }
        start = previous;
    }
}
