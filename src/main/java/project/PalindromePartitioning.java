package project;

import java.util.Arrays;

public class PalindromePartitioning {
    public int palindromePartitioning(String str) {
        int n = str.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Helper.helper(0, n, str, dp) - 1;
    }


}
