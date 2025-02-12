package com.fujarkojar.app.dp;

import java.util.Arrays;

// 62. Unique Paths
// https://leetcode.com/problems/unique-paths/description/
// https://takeuforward.org/data-structure/grid-unique-paths-count-paths-from-left-top-to-the-right-bottom-of-a-matrix/
// https://www.youtube.com/watch?v=t_f0nwwdg5o
public class UniquePaths {

    public static int solveByMemoization(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(m, n, dp);
    }

    private static int helperByMemoization(int i, int j, int[][] dp) {
        if (i == 1 && j == 1) {
            return 1;
        }
        // Memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        // Move down.
        int paths = 0;
        if (i > 1) {
            paths += helperByMemoization(i - 1, j, dp);
        }
        // Move right.
        if (j > 1) {
            paths += helperByMemoization(i, j - 1, dp);
        }
        dp[i][j] = paths;
        return paths;
    }

    public static int solveByTabulation(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        dp[1][1] = 1;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i > 1 || j > 1) {
                    // Move down.
                    int paths = 0;
                    if (i > 1) {
                        paths += dp[i - 1][j];
                    }
                    // Move right.
                    if (j > 1) {
                        paths += dp[i][j - 1];
                    }
                    dp[i][j] = paths;
                }
            }
        }
        return dp[m][n];
    }

    public static int solveByCombination(int m, int n) {
        // Use math.
        int N = (m - 1) + (n - 1);
        int K = Math.min(m - 1, n - 1);
        double result = 1;
        for (int i = 1; i <= K; ++i) {
            result = result * (N - i + 1) / i;
        }
        return (int) result;
    }
}
