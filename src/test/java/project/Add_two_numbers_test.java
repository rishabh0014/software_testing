package project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Add_two_numbers_test {

    // Helper method to create a linked list from an array
    private ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to an array
    private int[] toArray(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }

    @Test
    public void testAddTwoNumbers_simpleCase() {
        Add_two_numbers adder = new Add_two_numbers();

        ListNode l1 = createList(new int[] { 2, 4, 3 }); // Represents 342
        ListNode l2 = createList(new int[] { 5, 6, 4 }); // Represents 465

        ListNode result = adder.addTwoNumbers(l1, l2); // Should represent 807 -> [7, 0, 8]

        assertArrayEquals(new int[] { 7, 0, 8 }, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_withCarryOver() {
        Add_two_numbers adder = new Add_two_numbers();

        ListNode l1 = createList(new int[] { 9, 9, 9 }); // Represents 999
        ListNode l2 = createList(new int[] { 1 }); // Represents 1

        ListNode result = adder.addTwoNumbers(l1, l2); // Should represent 1000 -> [0, 0, 0, 1]

        assertArrayEquals(new int[] { 0, 0, 0, 1 }, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_differentLengths() {
        Add_two_numbers adder = new Add_two_numbers();

        ListNode l1 = createList(new int[] { 2, 4 }); // Represents 42
        ListNode l2 = createList(new int[] { 5, 6, 4 }); // Represents 465

        ListNode result = adder.addTwoNumbers(l1, l2); // Should represent 507 -> [7, 0, 5]

        assertArrayEquals(new int[] { 7, 0, 5 }, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_withZeroes() {
        Add_two_numbers adder = new Add_two_numbers();

        ListNode l1 = createList(new int[] { 0 }); // Represents 0
        ListNode l2 = createList(new int[] { 0 }); // Represents 0

        ListNode result = adder.addTwoNumbers(l1, l2); // Should represent 0 -> [0]

        assertArrayEquals(new int[] { 0 }, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_emptyInput() {
        Add_two_numbers adder = new Add_two_numbers();

        ListNode l1 = null; // Represents an empty list
        ListNode l2 = createList(new int[] { 1, 2, 3 }); // Represents 321

        ListNode result = adder.addTwoNumbers(l1, l2); // Should represent 321 -> [1, 2, 3]

        assertArrayEquals(new int[] { 1, 2, 3 }, toArray(result));
    }
}
