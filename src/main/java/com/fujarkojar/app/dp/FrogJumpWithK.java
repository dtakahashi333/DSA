package com.fujarkojar.app.dp;

import java.util.Arrays;

public class FrogJumpWithK {

    public static int solveByMemoization(int n, int k, int[] height) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helperByMemoization(height, k, n - 1, dp);
    }

    private static int helperByMemoization(int[] heights, int k, int ind, int[] dp) {
        if (ind == 0) {
            return 0;
        }

        // Memoization
        if (dp[ind] != -1) {
            return dp[ind];
        }

        int minCost = Integer.MAX_VALUE;
        for (int j = 1; j <= k; ++j) {
            if (ind >= j) {
                minCost = Math.min(minCost, Math.abs(heights[ind] - heights[ind - j]) + helperByMemoization(heights, k, ind - j, dp));
            }
        }
        dp[ind] = minCost;

        return minCost;
    }

    public static int solveByTabulation(int n, int k, int[] height) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i < n; ++i) {
            int minCost = Integer.MAX_VALUE;
            for (int j = 1; j <= k; ++j) {
                if (i >= j) {
                    minCost = Math.min(minCost, Math.abs(height[i] - height[i - j]) + dp[i - j]);
                }
            }
            dp[i] = minCost;
        }

        return dp[n - 1];
    }
}
