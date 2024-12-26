package com.fujarkojar.app;

import java.util.Arrays;

public class MatrixChainMultiplication {

    public static int solveByMemoization(int[] arr, int N) {
        int[][] dp = new int[N][N];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(arr, N, 1, N - 1, dp);
    }

    private static int helperByMemoization(int[] arr, int N, int i, int j, int[][] dp) {
        if (i == j) { // Base case
            return 0;
        }

        // Memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; ++k) {
            int steps = arr[i - 1] * arr[k] * arr[j]
                    + helperByMemoization(arr, N, i, k, dp)
                    + helperByMemoization(arr, N, k + 1, j, dp);
            min = Math.min(min, steps);
        }
        dp[i][j] = min;

        return min;
    }
}
