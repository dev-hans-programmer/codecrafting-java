package queue;

public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        QueueStack queueStack = new QueueStack();
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.dequeue();
        // queue.enqueue(40);

        // queue.enqueue(50);
        // System.out.println(queue);
        queueStack.enqueue(1);
        queueStack.enqueue(2);
        queueStack.enqueue(3);
        // System.out.println(queueStack);
        System.out.println(queueStack.dequeue());
    }
}
