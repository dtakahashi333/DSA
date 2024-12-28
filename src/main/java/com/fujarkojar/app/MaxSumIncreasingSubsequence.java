package com.fujarkojar.app;

import java.util.Arrays;

public class MaxSumIncreasingSubsequence {

    public static int solveByMemoization(int[] arr) {
        int N = arr.length;
        int[][] dp = new int[N][N + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(arr, N, 0, -1, dp);
    }

    private static int helperByMemoization(int[] arr, int N, int ind, int prevInd, int[][] dp) {
        if (ind > N - 1) {
            return 0;
        }
        // Memoization
        if (dp[ind][prevInd + 1] != -1) {
            return dp[ind][prevInd + 1];
        }
        int curSum = helperByMemoization(arr, N, ind + 1, prevInd, dp); // Not take
        if (prevInd == -1 || arr[prevInd] < arr[ind]) {
            curSum = Math.max(curSum, arr[ind] + helperByMemoization(arr, N, ind + 1, ind, dp));
        }
        dp[ind][prevInd + 1] = curSum;
        return curSum;
    }
}
