package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Queue_Test {
    @Test
    void arrayQueueTest() {

        MyQueue<Integer> queue = new Array_Queue_Impl<>();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        queue.enqueue(5);
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());

        assertEquals(5, queue.dequeue());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
        assertEquals(10, queue.dequeue());

    }

    @Test
    void circularQueueTest() {
        MyQueue<Character> queue = new Circular_Queue_Impl<>(3);
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        queue.enqueue('A');
        queue.enqueue('B');
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());

        assertEquals('A', queue.dequeue());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
        queue.enqueue('C');
        assertEquals('B', queue.dequeue());
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
        assertEquals('C', queue.dequeue());

        queue.enqueue('D');
        queue.enqueue('E');
        queue.enqueue('F');
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());

        assertEquals('D', queue.dequeue());
        queue.enqueue('G');
        assertEquals('D', queue.dequeue());
        assertEquals('E', queue.dequeue());
        assertEquals('G', queue.dequeue());
        assertTrue(queue.isEmpty());
    }
}
