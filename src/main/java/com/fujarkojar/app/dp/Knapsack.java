package com.fujarkojar.app.dp;

import java.util.Arrays;

// 0 1 Knapsack
// https://www.naukri.com/code360/problems/0-1-knapsack_920542?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
// https://takeuforward.org/dynamic-programming/striver-dp-series-dynamic-programming-problems/
// https://www.youtube.com/watch?v=GqOmJHQZivw&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=20
public class Knapsack {

    public static int solveByMemoization(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight + 1];
        for (int[] a : dp) {
            Arrays.fill(a, Integer.MIN_VALUE);
        }
        return helperByMemoization(weight, value, n, maxWeight, n - 1, dp);
    }

    private static int helperByMemoization(int[] weight, int[] value, int n, int maxWeight, int ind, int[][] dp) {
        if (ind == 0) { // Base case
            if (weight[0] <= maxWeight) {
                return value[0];
            } else {
                return 0;
            }
        }
        // Memoization
        if (dp[ind][maxWeight] != Integer.MIN_VALUE) {
            return dp[ind][maxWeight];
        }
        int curValue = helperByMemoization(weight, value, n, maxWeight, ind - 1, dp); // Not take
        if (weight[ind] <= maxWeight) { // Take
            curValue = Math.max(curValue, value[ind] + helperByMemoization(weight, value, n, maxWeight - weight[ind], ind - 1, dp));
        }
        dp[ind][maxWeight] = curValue;
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
