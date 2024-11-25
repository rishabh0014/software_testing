package project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Next_permutation_test {

    @Test
    void testNextPermutation_RegularCase() {
        Next_permutation obj = new Next_permutation();
        int[] nums = { 1, 2, 3 };
        obj.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 3, 2 }, nums);
    }

    @Test
    void testNextPermutation_DescendingOrder() {
        Next_permutation obj = new Next_permutation();
        int[] nums = { 3, 2, 1 };
        obj.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }

    @Test
    void testNextPermutation_SingleElement() {
        Next_permutation obj = new Next_permutation();
        int[] nums = { 1 };
        obj.nextPermutation(nums);
        assertArrayEquals(new int[] { 1 }, nums);
    }

    @Test
    void testNextPermutation_AllElementsSame() {
        Next_permutation obj = new Next_permutation();
        int[] nums = { 2, 2, 2 };
        obj.nextPermutation(nums);
        assertArrayEquals(new int[] { 2, 2, 2 }, nums);
    }

    @Test
    void testNextPermutation_MiddlePivot() {
        Next_permutation obj = new Next_permutation();
        int[] nums = { 1, 3, 2 };
        obj.nextPermutation(nums);
        assertArrayEquals(new int[] { 2, 1, 3 }, nums);
    }

    @Test
    void testNextPermutation_LargeArray() {
        Next_permutation obj = new Next_permutation();
        int[] nums = { 1, 2, 3, 6, 5, 4 };
        obj.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 2, 4, 3, 5, 6 }, nums);
    }
}
