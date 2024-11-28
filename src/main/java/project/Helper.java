package project;

public class Helper {
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
