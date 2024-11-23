package project;

import java.util.ArrayList;

public class Circular_Queue_Impl<T> implements MyQueue<T> {
    private ArrayList<T> elements;
    private int front, rear, size, capacity;

    public Circular_Queue_Impl(int capacity) {
        this.capacity = capacity;
        elements = new ArrayList<>(capacity);
        front = this.size = 0;
        rear = capacity - 1;
    }

    public void enqueue(T element) {
        rear = (rear + 1) % capacity;
        elements.add(rear, element);
        size++;
    }

    public T dequeue() {
        T item = elements.get(front);
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
