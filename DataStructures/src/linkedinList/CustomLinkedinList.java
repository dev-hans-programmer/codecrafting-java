package linkedinList;

import java.util.NoSuchElementException;;

class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
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

    public void addFirst(int value) {
        var node = new Node(value, null);

        if (isEmpty())
            start = node;
        else {
            node.next = start;
            start = node;
        }

        count++;

    }

    public void addLast(int value) {
        var node = new Node(value, null);

        if (isEmpty())
            addFirst(value);
        else {
            var temp = start;

            while (temp.next != null)
                temp = temp.next;

            temp.next = node;

        }
        count++;
    }

    public void addAfter(Node ref, int value) {
        var node = new Node(value, null);

        if (isEmpty())
            addFirst(value);
        else if (start.next == null) {
            addLast(value);
        } else {
            node.next = ref.next;
            ref.next = node;
        }
        count++;

    }

    public void traverse() {
        Node current = start;
        while (current != null) {
            System.out.print(current.value);
            current = current.next;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public int indexOf(int value) {
        int index = 0;
        var current = start;
        while (current != null) {
            if (current.value == value)
                return index;
            current = current.next;
            index++;
        }
        return -1;

    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public Node find(int value) {
        if (isEmpty())
            return null;

        var temp = start;

        while (temp != null) {
            if (temp.value == value)
                return temp;
            temp = temp.next;
        }
        return null;

    }

    public void deleteFirst() {
        var current = start;
        if (isEmpty())
            throw new NoSuchElementException();
        current = start.next;
        start.next = null;
        start = current;
        count--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (start.next == null) {
            deleteFirst();
        } else {
            var current = start;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
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
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;

    }

    public void reverse() {
        Node previous = null;
        var current = start;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        start = previous;
    }

    public Node getMiddleNode() {
        Node slow, fast;
        slow = fast = start;

        if (start == null || start.next == null)
            return null;

        // two pointer technique
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public void deleteFromMiddleNode() {
        Node slow, fast, prev;
        slow = fast = start;
        prev = null;
        // two pointer technique
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

    }

    public int getKthNodeFromEnd(int k) {
        Node first, second;

        first = second = start;

        for (int i = 0; i < k; i++) {
            if (first == null)
                return 0;

            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.value;

    }

}
