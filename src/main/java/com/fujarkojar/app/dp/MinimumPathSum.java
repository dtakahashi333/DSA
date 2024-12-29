package com.fujarkojar.app.dp;

import java.util.Arrays;

public class MinimumPathSum {

    public static int solveByMemoization(int[][] grid) {
        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(grid, N - 1, M - 1, dp);
    }

    private static int helperByMemoization(int[][] grid, int i, int j, int[][] dp) {
        if (i == 0 && j == 0) { // Base case
            return grid[i][j];
        }

        // Memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int cost = Integer.MAX_VALUE;
        // Move down.
        if (i > 0) {
            cost = Math.min(cost, grid[i][j] + helperByMemoization(grid, i - 1, j, dp));
        }
        // Move right.
        if (j > 0) {
            cost = Math.min(cost, grid[i][j] + helperByMemoization(grid, i, j - 1, dp));
        }
        dp[i][j] = cost;

        return cost;
    }

    public static int solveByTabulation(int[][] grid) {
        // Tabulation
        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (i == 0 && j == 0) { // Base case
                    dp[i][j] = grid[i][j];
                } else {
                    int cost = Integer.MAX_VALUE;
                    if (i > 0) {
                        cost = Math.min(cost, grid[i][j] + dp[i - 1][j]); // Move bottom
                    }
                    if (j > 0) {
                        cost = Math.min(cost, grid[i][j] + dp[i][j - 1]); // Move right
                    }
                    dp[i][j] = cost;
                }
            }
        }

        return dp[N - 1][M - 1];
    }
}
