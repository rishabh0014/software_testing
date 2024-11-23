package project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Recursion_Algo_Test {

    @Test
    public void testCombinationSum_WhenTargetIsZero() {
        Recursion_Algo recursion = new Recursion_Algo();
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>()); // Expect an empty list for target 0
        List<List<Integer>> actual = recursion.combinationSum(candidates, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testCombinationSum_WhenNoCombinationsPossible() {
        Recursion_Algo recursion = new Recursion_Algo();
        int[] candidates = {2, 4, 6};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = recursion.combinationSum(candidates, 7);
        assertEquals(expected, actual); // Expect empty list as no combinations possible
    }

    @Test
    public void testCombinationSum_WhenAllCombinationsAreSame() {
        Recursion_Algo recursion = new Recursion_Algo();
        int[] candidates = {2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2)); // Expect [2, 2, 2, 2] for target 8
        List<List<Integer>> actual = recursion.combinationSum(candidates, 8);
        assertEquals(expected, actual);
    }

    @Test
    public void testCombinationSum_WhenTargetIsZer() {
        Recursion_Algo recursion = new Recursion_Algo();
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList()); // Expect an empty list for target 0
        List<List<Integer>> actual = recursion.combinationSum(candidates, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testCombinationSum_WhenNoCombinationPossible() {
        Recursion_Algo recursion = new Recursion_Algo();
        int[] candidates = {2, 4, 6};
        List<List<Integer>> expected = Arrays.asList(); // Expect empty list as no combinations possible
        List<List<Integer>> actual = recursion.combinationSum(candidates, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testCombinationSum_WhenMultipleCombinationsPossible() {
        Recursion_Algo recursion = new Recursion_Algo();
        int[] candidates = {2, 3};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2), Arrays.asList(3, 3)); // Expect [2, 2, 2] and [3, 3] for target 6
        List<List<Integer>> actual = recursion.combinationSum(candidates, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorial() {
        Recursion_Algo RecursionExamples = new Recursion_Algo();
        assertEquals(1, RecursionExamples.factorial(0));
        assertEquals(1, RecursionExamples.factorial(1));
        assertEquals(2, RecursionExamples.factorial(2));
        assertEquals(6, RecursionExamples.factorial(3));
        assertEquals(24, RecursionExamples.factorial(4));
        assertEquals(120, RecursionExamples.factorial(5));
    }

    @Test
    public void testFibonacci() {
        Recursion_Algo RecursionExamples = new Recursion_Algo();
        assertEquals(0, RecursionExamples.fibonacci(0));
        assertEquals(1, RecursionExamples.fibonacci(1));
        assertEquals(1, RecursionExamples.fibonacci(2));
        assertEquals(2, RecursionExamples.fibonacci(3));
        assertEquals(3, RecursionExamples.fibonacci(4));
        assertEquals(5, RecursionExamples.fibonacci(5));
        assertEquals(8, RecursionExamples.fibonacci(6));
    }

    @Test
    public void testTowerOfHanoi() {
        Recursion_Algo RecursionExamples = new Recursion_Algo();
        assertDoesNotThrow(() -> RecursionExamples.towerOfHanoi(3, 'A', 'B', 'C'));
        assertDoesNotThrow(() -> RecursionExamples.towerOfHanoi(4, 'A', 'B', 'C'));
        assertDoesNotThrow(() -> RecursionExamples.towerOfHanoi(5, 'A', 'B', 'C'));
    }
    
}
