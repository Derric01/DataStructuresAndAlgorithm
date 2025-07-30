// File: ArrayQueue.java

public class ArrayQueue {
    public static void main(String[] args) {
        ArrayQueue1 q = new ArrayQueue1(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();  // Output: 10 20 30

        q.dequeue();  // Removes 10
        q.display();  // Output: 20 30

        System.out.println("Front: " + q.peek()); // Output: 20

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Will show overflow
        q.display();   // Output: 20 30 40 50
    }
}

// Queue implementation using circular array
class ArrayQueue1 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public ArrayQueue1(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue method - adds to rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue method - removes from front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot dequeue.");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    // Peek method - views front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! Cannot peek.");
            return -1;
        }
        return queue[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Queue elements are:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println(); // newline
    }
}
