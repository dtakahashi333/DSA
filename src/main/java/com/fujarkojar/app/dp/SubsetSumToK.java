package com.fujarkojar.app.dp;

import java.util.Arrays;

// Subset Sum Equal To K
// https://www.naukri.com/code360/problems/subset-sum-equal-to-k_1550954?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
// https://takeuforward.org/data-structure/subset-sum-equal-to-target-dp-14/
// https://www.youtube.com/watch?v=fWX9xDmIzRI&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=15
public class SubsetSumToK {

    public static boolean solveByMemoization(int n, int k, int[] arr) {
        int[][] dp = new int[n][k + 1];
        for (int[] ar : dp) {
            Arrays.fill(ar, -1);
        }
        return helperByMemoization(arr, n, n - 1, k, dp) == 1;
    }

    private static int helperByMemoization(int[] arr, int n, int ind, int k, int[][] dp) {
        // Base case.
        if (ind == 0) {
            return (arr[ind] == k || k == 0) ? 1 : 0;
        }
        // Memoization
        if (dp[ind][k] != -1) {
            return dp[ind][k];
        }
        int take = (arr[ind] <= k) ? helperByMemoization(arr, n, ind - 1, k - arr[ind], dp) : 0; // Take
        int notTake = helperByMemoization(arr, n, ind - 1, k, dp); // Not take
        dp[ind][k] = (take == 1 || notTake == 1) ? 1 : 0;
        return dp[ind][k];
    }

    public static boolean solveByTabulation(int n, int k, int[] arr) {
        int[][] dp = new int[n][k + 1];
        for (int[] ar : dp) {
            Arrays.fill(ar, -1);
        }
        // Base cases.
        for (int j = 0; j <= k; ++j) {
            dp[0][j] = (arr[0] == j || j == 0) ? 1 : 0;
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j <= k; ++j) {
                int take = (arr[i] <= j) ? dp[i - 1][j - arr[i]] : 0;
                int notTake = dp[i - 1][j];
                dp[i][j] = (take == 1 || notTake == 1) ? 1 : 0;
            }
        }
        return dp[n - 1][k] == 1;
    }
}
