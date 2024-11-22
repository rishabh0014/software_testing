package project.queue;

import java.util.ArrayList;

public class Array_Queue_Impl<T> implements MyQueue<T> {
    private ArrayList<T> elements;

    public Array_Queue_Impl() {
        elements = new ArrayList<>();
    }

    public void enqueue(T element) {
        elements.add(element);
    }

    public T dequeue() {
        return elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}