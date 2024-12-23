package com.fujarkojar.app;

import java.util.Arrays;

public class Knapsack {

    public static int solveByMemoization(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight + 1];
        for (int[] a : dp) {
            Arrays.fill(a, Integer.MIN_VALUE);
        }
        return helperByMemoization(weight, value, n, maxWeight, 0, 0, dp);
    }

    private static int helperByMemoization(int[] weight, int[] value, int n, int maxWeight, int ind, int curWeight, int[][] dp) {
        if (ind > n - 1) { // Base case
            return 0;
        }
        // Memoization
        if (dp[ind][curWeight] != Integer.MIN_VALUE) {
            return dp[ind][curWeight];
        }
        int curValue = helperByMemoization(weight, value, n, maxWeight, ind + 1, curWeight, dp); // Not take
        if (curWeight + weight[ind] <= maxWeight) { // Take
            curValue = Math.max(curValue, value[ind] + helperByMemoization(weight, value, n, maxWeight, ind + 1, curWeight + weight[ind], dp));
        }
        dp[ind][curWeight] = curValue;
        return curValue;
    }

    public static int solveByTabulation(int[] weight, int[] value, int n, int maxWeight) {
        // Base case
        int[][] dp = new int[n][maxWeight + 1];
        for (int[] a : dp) {
            Arrays.fill(a, 0);
        }
        for (int W = weight[0]; W <= maxWeight; ++W) {
            dp[0][W] = value[0];
        }
        for (int ind = 1; ind < weight.length; ++ind) {
            for (int W = 0; W <= maxWeight; ++W) {
                int curValue = 0 + dp[ind - 1][W]; // Not take
                if (weight[ind] <= W) {
                    curValue = Math.max(
                            curValue,
                            value[ind] + dp[ind - 1][W - weight[ind]] // Take
                    );
                }
                dp[ind][W] = curValue;
            }
        }

        return dp[n - 1][maxWeight];
    }
}
