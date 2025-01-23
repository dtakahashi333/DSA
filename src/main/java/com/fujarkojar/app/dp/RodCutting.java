package com.fujarkojar.app.dp;

import java.util.Arrays;

// Rod cutting problem
// https://www.naukri.com/code360/problems/rod-cutting-problem_800284?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
// https://www.youtube.com/watch?v=mO8XpGoJwuo&t=757s
public class RodCutting {

    public static int solveByMemoization(int[] price, int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helperByMemoization(price, n, dp);
    }

    private static int helperByMemoization(int[] price, int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        // Memoization
        if (dp[n] != -1) {
            return dp[n];
        }
        int maxCost = 0;
        for (int i = 1; i <= n; ++i) {
            int cost = price[i - 1] + helperByMemoization(price, n - i, dp);
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        dp[n] = maxCost;
        return maxCost;
    }

    public static int solveByTabulation(int[] price, int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int l = 1; l <= n; ++l) {
            for (int i = 1; i <= l; ++i) {
                int cost = price[i - 1] + dp[l - i];
                if (cost > dp[l]) {
                    dp[l] = cost;
                }
            }
        }
        return dp[n];
    }

    public static int solveByMemoization2(int[] price, int n) {
        int[][] dp = new int[n][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helperByMemoization2(price, n - 1, n, dp);
    }

    private static int helperByMemoization2(int[] price, int ind, int n, int[][] dp) {
        // Base cases
        if (ind == 0) {
            return price[ind] * n;
        }
        // Memoization
        if (dp[ind][n] != -1) {
            return dp[ind][n];
        }
        // Not take
        int notTake = helperByMemoization2(price, ind - 1, n, dp);
        // Take
        int take = Integer.MIN_VALUE;
        if (ind + 1 <= n) {
            take = price[ind] + helperByMemoization2(price, ind, n - ind - 1, dp);
        }
        dp[ind][n] = Math.max(notTake, take);
        return dp[ind][n];
    }

    public static int solveByTabulation2(int[] price, int n) {
        int[][] dp = new int[n][n + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        // Tabulation
        for (int k = 0; k <= n; ++k) {
            dp[0][k] = k * price[0];
        }
        for (int i = 1; i < n; ++i) {
            for (int k = 0; k <= n; ++k) {
                // Not take
                int notTake = dp[i - 1][k];
                // Take
                int take = Integer.MIN_VALUE;
                if (i + 1 <= k) {
                    take = price[i] + dp[i][k - i - 1];
                }
                dp[i][k] = Math.max(notTake, take);
            }
        }
        return dp[n - 1][n];
    }
}
