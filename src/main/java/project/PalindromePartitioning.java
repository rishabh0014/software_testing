package project;

import java.util.Arrays;

public class PalindromePartitioning {
    public int palindromePartitioning(String str) {
        int n = str.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(0, n, str, dp) - 1;
    }

    static int helper(int i, int n, String str, int[] dp) {
        if (i == n) return 0;

        if (dp[i] != -1) return dp[i];
        int minCost = Integer.MAX_VALUE;
        for (int j = i; j < n; j++) {
            if (PalindromeOrNot.isPalindrome(i, j, str)) {
                int cost = 1 + helper(j + 1, n, str, dp);
                minCost = Math.min(minCost, cost);
            }
        }
        return dp[i] = minCost;
    }
}
