package project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Two_sum_test {

    @Test
    public void testTwoSum_validCase() {
        Two_sum solver = new Two_sum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        assertArrayEquals(new int[] { 0, 1 }, result); // 2 + 7 = 9
    }

    @Test
    public void testTwoSum_noSolution() {
        Two_sum solver = new Two_sum();
        int[] nums = { 1, 2, 3 };
        int target = 6;
        int[] result = solver.twoSum(nums, target);
        assertArrayEquals(new int[] {}, result); // No solution
    }

    @Test
    public void testTwoSum_singlePair() {
        Two_sum solver = new Two_sum();
        int[] nums = { 3, 3 };
        int target = 6;
        int[] result = solver.twoSum(nums, target);
        assertArrayEquals(new int[] { 0, 1 }, result); // 3 + 3 = 6
    }

    @Test
    public void testTwoSum_multiplePairs() {
        Two_sum solver = new Two_sum();
        int[] nums = { 1, 2, 3, 4 };
        int target = 5;
        int[] result = solver.twoSum(nums, target);
        assertArrayEquals(new int[] { 0, 3 }, result); // 1 + 4 = 5
    }

    @Test
    public void testTwoSum_negativeNumbers() {
        Two_sum solver = new Two_sum();
        int[] nums = { -3, 4, 3, 90 };
        int target = 0;
        int[] result = solver.twoSum(nums, target);
        assertArrayEquals(new int[] { 0, 2 }, result); // -3 + 3 = 0
    }

    @Test
    public void testTwoSum_duplicateNumbers() {
        Two_sum solver = new Two_sum();
        int[] nums = { 1, 5, 5, 3 };
        int target = 10;
        int[] result = solver.twoSum(nums, target);
        assertArrayEquals(new int[] { 1, 2 }, result); // 5 + 5 = 10
    }
}
