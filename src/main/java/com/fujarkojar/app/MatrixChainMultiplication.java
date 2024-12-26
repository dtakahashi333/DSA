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

    public static int solveByTabulation(int[] arr, int N) {
        // Table initialization
        int[][] dp = new int[N][N];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        // Base case
        for (int i = 1; i < N; ++i) {
            dp[i][i] = 0;
        }

        for (int l = 1; l < N; ++l) {
            for (int i = 1; i < N - l; ++i) {
                int j = i + l;
                int min = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; ++k) {
                    int steps = arr[i - 1] * arr[k] * arr[j] + dp[i][k] + dp[k + 1][j];
                    min = Math.min(min, steps);
                }
                dp[i][j] = min;
            }
        }

        return dp[1][N - 1];
    }
}
