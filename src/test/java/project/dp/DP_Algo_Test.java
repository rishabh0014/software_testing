package project.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP_Algo_Test {

    @Test
    public void climbingStairsTest() {
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertEquals(dpAlgo.climbingStairs(0), 1);
        Assertions.assertEquals(dpAlgo.climbingStairs(1), 1);
        Assertions.assertEquals(dpAlgo.climbingStairs(2), 2);
        Assertions.assertEquals(dpAlgo.climbingStairs(5), 8);
        Assertions.assertEquals(dpAlgo.climbingStairs(10), 89);
    }

    @Test
    public void frogJumpWithDistanceKTest() {
        DP_Algo dpAlgo1 = new DP_Algo();
        int[] heights1 = {30, 10, 60, 10, 60, 50};
        Assertions.assertEquals(dpAlgo1.frogJumpWithDistanceK(heights1, 2), 40);
        Assertions.assertEquals(dpAlgo1.frogJumpWithDistanceK(heights1, 0), Integer.MAX_VALUE);
        Assertions.assertEquals(dpAlgo1.frogJumpWithDistanceK(heights1, 1), 180);

        DP_Algo dpAlgo2 = new DP_Algo();
        int[] heights2 =  {30};
        Assertions.assertEquals(dpAlgo2.frogJumpWithDistanceK(heights2, 3), 0);
        Assertions.assertEquals(dpAlgo2.frogJumpWithDistanceK(heights2, 1), 0);

        DP_Algo dpAlgo3 = new DP_Algo();
        int[] heights3 = {30, 20};
        Assertions.assertEquals(dpAlgo3.frogJumpWithDistanceK(heights3, 3), 10);
        Assertions.assertEquals(dpAlgo3.frogJumpWithDistanceK(heights3, 1), 10);

        DP_Algo dpAlgo4 = new DP_Algo();
        int[] heights4 = {};
        Assertions.assertEquals(dpAlgo4.frogJumpWithDistanceK(heights4, 3), -1);
        Assertions.assertEquals(dpAlgo4.frogJumpWithDistanceK(heights4, 1), -1);
    }

    @Test
    public void uniquePathsTest() {
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertEquals(dpAlgo.uniquePaths(1, 1), 1);
        Assertions.assertEquals(dpAlgo.uniquePaths(2, 2), 2);
        Assertions.assertEquals(dpAlgo.uniquePaths(3, 1), 1);
        Assertions.assertEquals(dpAlgo.uniquePaths(1, 3), 1);
        Assertions.assertEquals(dpAlgo.uniquePaths(3, 2), 3);
        Assertions.assertEquals(dpAlgo.uniquePaths(3, 4), 10);
    }

    @Test
    public void subsetSumToKTest() {
        DP_Algo dpAlgo1 = new DP_Algo();
        int[] arr1 = {1, 4, 5, 6};
        Assertions.assertTrue(dpAlgo1.subsetSumToK(9, arr1));
        Assertions.assertTrue(dpAlgo1.subsetSumToK(0, arr1));
        Assertions.assertFalse(dpAlgo1.subsetSumToK(20, arr1));

        DP_Algo dpAlgo2 = new DP_Algo();
        int[] arr2 =  {};
        Assertions.assertFalse(dpAlgo2.subsetSumToK(20, arr2));
        Assertions.assertTrue(dpAlgo2.subsetSumToK(0, arr2));
    }

    @Test
    public void editDistanceTest() {
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertEquals(dpAlgo.editDistance("", ""), 0);
        Assertions.assertEquals(dpAlgo.editDistance("ABCD", ""), 4);
        Assertions.assertEquals(dpAlgo.editDistance("", "ABCD"), 0);
        Assertions.assertEquals(dpAlgo.editDistance("ABCD", "ABCD"), 0);
        Assertions.assertEquals(dpAlgo.editDistance("ABCC", "ABCD"), 1);
        Assertions.assertEquals(dpAlgo.editDistance("ACCC", "BCACE"), 3);
        Assertions.assertEquals(dpAlgo.editDistance("BCABC", "ABCD"), 3);
    }

    @Test
    public void lisTest() {
        DP_Algo dpAlgo1 = new DP_Algo();
        int[] arr1 = {-1, 0, 4, 6, 3};
        Assertions.assertEquals(dpAlgo1.longestIncreasingSubsequence(arr1), 4);

        DP_Algo dpAlgo2 = new DP_Algo();
        int[] arr2 = {-1};
        Assertions.assertEquals(dpAlgo2.longestIncreasingSubsequence(arr2), 1);

        DP_Algo dpAlgo3 = new DP_Algo();
        int[] arr3 = {};
        Assertions.assertEquals(dpAlgo3.longestIncreasingSubsequence(arr3), 0);

        DP_Algo dpAlgo4 = new DP_Algo();
        int[] arr4 = {-1, -2, -3, -4};
        Assertions.assertEquals(dpAlgo4.longestIncreasingSubsequence(arr4), 1);

        DP_Algo dpAlgo5 = new DP_Algo();
        int[] arr5 = {1, 2, 3, 4, 5};
        Assertions.assertEquals(dpAlgo5.longestIncreasingSubsequence(arr5), 5);

    }

    @Test
    public void costOfCutsTest() {
        DP_Algo dpAlgo1 = new DP_Algo();
        ArrayList<Integer> cuts1 = new ArrayList<>(Arrays.asList(3, 5, 1, 4));
        Assertions.assertEquals(dpAlgo1.costOfCuts(7, cuts1.size(), cuts1), 16);

        DP_Algo dpAlgo2 = new DP_Algo();
        ArrayList<Integer> cuts2 = new ArrayList<>();
        Assertions.assertEquals(dpAlgo2.costOfCuts(7, 0, cuts2), 0);

        DP_Algo dpAlgo3 = new DP_Algo();
        ArrayList<Integer> cuts3 = new ArrayList<>(Arrays.asList(3, 5, 1, 4));
        Assertions.assertEquals(dpAlgo3.costOfCuts(0, cuts3.size(), cuts3), 11);

        DP_Algo dpAlgo4 = new DP_Algo();
        ArrayList<Integer> cuts4 = new ArrayList<>();
        Assertions.assertEquals(dpAlgo4.costOfCuts(0, 0, cuts4), 0);

        DP_Algo dpAlgo5 = new DP_Algo();
        ArrayList<Integer> cuts5 = new ArrayList<>(List.of(1));
        Assertions.assertEquals(dpAlgo5.costOfCuts(6, 1, cuts5), 6);
    }

    @Test
    public void canPartitionBasicCaeTest() {
        int[] arr = {1, 5, 11, 5};
        boolean expected = true;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void canPartitionNPartitionPossibleTest() {
        int[] arr = {1, 2, 3, 5};
        boolean expected = false;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void canPartitionAllEqualValuesTest() {
        int[] arr = {3, 3, 3, 3};
        boolean expected = true;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void wordBreakBasicCaseTest() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean expected = true;

        boolean result = DP_Algo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void wordBreakEmptyStringTest() {
        String s = "";
        List<String> wordDict = Arrays.asList("a", "b", "c");
        boolean expected = true;

        boolean result = DP_Algo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void wordBreakNoWordMatchTest() {
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        boolean expected = true;

        boolean result = DP_Algo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void wordBreakRepeatedWordsTest() {
        String s = "aaaaaaa";
        List<String> wordDict = Arrays.asList("aaaa", "aaa");
        boolean expected = true; // Expected result for repeated words

        boolean result = DP_Algo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void wordBreakDifferentCasesTest() {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        boolean expected = false;

        boolean result = DP_Algo.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void jobSchedulingBasicCaseTest() {
        int[] startTime = {1, 2, 3, 3};
        int[] endTime = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};
        int expected = 120;

        int result = DP_Algo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void jobSchedulingNJobsTest() {
        int[] startTime = {};
        int[] endTime = {};
        int[] profit = {};
        int expected = 0;

        int result = DP_Algo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void jobSchedulingSingleJobTest() {
        int[] startTime = {1};
        int[] endTime = {3};
        int[] profit = {5};
        int expected = 5;

        int result = DP_Algo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void jobSchedulingEqualProfitsTest() {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 4, 5};
        int[] profit = {10, 10, 10};
        int expected = 20;

        int result = DP_Algo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void jobSchedulingLargeProfitsTest() {
        int[] startTime = {1, 2, 3, 4, 5};
        int[] endTime = {3, 4, 5, 6, 7};
        int[] profit = {100, 200, 300, 400, 500};
        int expected = 900;

        int result = DP_Algo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }




    @Test
    public void jobSchedulingNoJobsTest() {
        int[] startTime = {};
        int[] endTime = {};
        int[] profit = {};
        int expected = 0;

        int result = DP_Algo.jobScheduling(startTime, endTime, profit);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void optimalStrategyOfGameBasicCaseTest() {
        int[] arr = {8, 15, 3, 7};
        int n = arr.length;
        int expected = 22;

        int result = DP_Algo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void optimalStrategyOfGameAllEqualValuesTest() {
        int[] arr = {5, 5, 5, 5, 5};
        int n = arr.length;
        int expected = 15;

        int result = DP_Algo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void optimalStrategyOfGameTwoElementsTest() {
        int[] arr = {9, 15};
        int n = arr.length;
        int expected = 15;

        int result = DP_Algo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void optimalStrategyOfGameThreeElementsTest() {
        int[] arr = {6, 4, 2};
        int n = arr.length;
        int expected = 8;

        int result = DP_Algo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void optimalStrategyOfGameFourElementsTest() {
        int[] arr = {4, 2, 10, 5};
        int n = arr.length;
        int expected = 14;

        int result = DP_Algo.optimalStrategyOfGame(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void maxSumISBasicCaseTest() {
        int[] arr = {1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        int expected = 106;

        int result = DP_Algo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void maxSumISSingleElementArrayTest() {
        int[] arr = {5};
        int n = arr.length;
        int expected = 5;

        int result = DP_Algo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void maxSumISDecreasingArrayTest() {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        int expected = 5;

        int result = DP_Algo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void maxSumISAscendingArrayTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int expected = 15;

        int result = DP_Algo.maxSumIS(arr, n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void canPartitionBasicCaseTest() {
        int[] arr = {1, 5, 11, 5};
        boolean expected = true;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void canPartitionSingleElementArrayTest() {
        int[] arr = {10};
        boolean expected = false;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void canPartitionEmptyArrayTest() {
        int[] arr = {};
        boolean expected = true;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void canPartitionNoPartitionPossibleTest() {
        int[] arr = {3, 4, 5, 6};
        boolean expected = true;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void canPartitionLargeArrayTest() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        boolean expected = false;

        boolean result = DP_Algo.canPartition(arr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lCSBasicCaseTest() {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        int expected = 3;

        int result = DP_Algo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lCSOneEmptyStringTest() {
        String s1 = "hello";
        String s2 = "";
        int expected = 0;

        int result = DP_Algo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lCSSameStringsTest() {
        String s1 = "same";
        String s2 = "same";
        int expected = 4;

        int result = DP_Algo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lCSNoCommonSubsequenceTest() {
        String s1 = "abc";
        String s2 = "def";
        int expected = 0;

        int result = DP_Algo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lCSLongStringsTest() {
        String s1 = "abcdefghijkl";
        String s2 = "mnopqrstuvwxyz";
        int expected = 0;

        int result = DP_Algo.lcs(s1, s2);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void coinChangeBasicCaseTest() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;

        int result = DP_Algo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void coinChangeNoSolutionTest() {
        int[] coins = {2};
        int amount = 3;
        int expected = -1;

        int result = DP_Algo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void coinChangeZeroAmountTest() {
        int[] coins = {1, 2, 5};
        int amount = 0;
        int expected = 0;

        int result = DP_Algo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void coinChangeSameCoinValueTest() {
        int[] coins = {1, 1, 1, 1, 1};
        int amount = 3;
        int expected = 3;

        int result = DP_Algo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void coinChangeLargeAmountTest() {
        int[] coins = {1, 2, 5};
        int amount = 100;
        int expected = 20;

        int result = DP_Algo.coinChange(coins, amount);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void knapsackBasicCaseTest() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 7, 2, 9};
        int n = 4;
        int maxWeight = 5;
        int expected = 10;

        int result = DP_Algo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void knapsackEmptyInputTest() {
        int[] weights = {};
        int[] values = {};
        int n = 0;
        int maxWeight = 10;
        int expected = 0;

        int result = DP_Algo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void knapsackMaxWeightZeroTest() {
        int[] weights = {1, 2, 3};
        int[] values = {5, 3, 7};
        int n = 3;
        int maxWeight = 0;
        int expected = 0;

        int result = DP_Algo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void knapsackAllItemsFitTest() {
        int[] weights = {1, 2, 3};
        int[] values = {5, 3, 7};
        int n = 3;
        int maxWeight = 6;
        int expected = 15;

        int result = DP_Algo.knapsack(weights, values, n, maxWeight);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void rodCuttingTest() {
        int[] prices = {1, 5, 8, 9};
        int n = 4;

        int expected = 10;
        int result = DP_Algo.rodCutting(prices, n);

        Assertions.assertEquals(expected, result);

        prices = new int[0];
        n = 0;

        expected = 0;
        result = DP_Algo.rodCutting(prices, n);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void subsetSumTest() {
        int[] arr = {3, 4, 5};
        int sum = 9;

        boolean expected = true;
        boolean result = DP_Algo.subsetSum(arr, sum);
        Assertions.assertEquals(expected, result);

        arr = new int[]{1, 2, 3, 8};
        sum = 6;
        expected = true;
        result = DP_Algo.subsetSum(arr, sum);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void partitionProblemTest() {
        int n = 4;
        int expected = 14;

        int result = DP_Algo.partitionProblem(n);
        Assertions.assertEquals(expected, result);

        n = 2;
        expected = 2;

        result = DP_Algo.partitionProblem(n);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void maxRibbonCutTest() {
        int[] ribbons = {2,3,5};
        int n = 3;
        int maxLength = 5;
        int expected = 2;

        int result = DP_Algo.maxRibbonCut(ribbons, n, maxLength);
        Assertions.assertEquals(expected, result);

        ribbons = new int[]{2,4};
        n = 2;
        maxLength = 7;
        expected = 2;

        result = DP_Algo.maxRibbonCut(ribbons, n, maxLength);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void maximumChocolatesTest() {
        int[][] matrix = {{2, 3, 1, 2},
                {3, 4, 2, 2},
                {5, 6, 3, 5}};
        int n = 3, m = 4;
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertEquals(dpAlgo.maximumChocolates(n, m, matrix), 21);
    }

    @Test
    public void wildcardMatchingTest() {
        String S1 = "ab*cd";
        String S2 = "abdefcd";
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertTrue(dpAlgo.wildcardMatching(S1, S2));
    }

    @Test
    public void burstBalloonsTest() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 1, 5, 8));
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertEquals(dpAlgo.maxCoins(a), 167);
    }

    @Test
    public void maxSumAfterPartitioningTest() {
        int[] num = {1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        DP_Algo dpAlgo = new DP_Algo();
        Assertions.assertEquals(dpAlgo.maxSumAfterPartitioning(num, 3), 84);
    }
}
