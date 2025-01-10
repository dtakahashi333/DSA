package com.fujarkojar.app.dp;

import java.util.Arrays;

// Ninja’s Training
// https://www.naukri.com/code360/problems/ninja-s-training_3621003?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
// https://www.youtube.com/watch?v=AE39gJYuRog
public class NinjaTraining {

    public static int solveByMemoization(int n, int[][] points) {
        int[][] dp = new int[n][4];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(n, points, 0, 3, dp);
    }

    private static int helperByMemoization(int n, int[][] points, int ind, int prevAct, int[][] dp) {
        if (ind == n - 1) {
            if (prevAct == 0) {
                return Math.max(points[ind][1], points[ind][2]);
            }
            if (prevAct == 1) {
                return Math.max(points[ind][0], points[ind][2]);
            }
            if (prevAct == 2) {
                return Math.max(points[ind][0], points[ind][1]);
            }
        }

        // Memoization
        if (dp[ind][prevAct] != -1) {
            return dp[ind][prevAct];
        }

        int maxMerit = 0;
        if (prevAct != 0) {
            maxMerit = Math.max(maxMerit, points[ind][0] + helperByMemoization(n, points, ind + 1, 0, dp));
        }
        if (prevAct != 1) {
            maxMerit = Math.max(maxMerit, points[ind][1] + helperByMemoization(n, points, ind + 1, 1, dp));
        }
        if (prevAct != 2) {
            maxMerit = Math.max(maxMerit, points[ind][2] + helperByMemoization(n, points, ind + 1, 2, dp));
        }

        dp[ind][prevAct] = maxMerit;
        return maxMerit;
    }

    public static int solveByTabulation(int n, int[][] points) {
        int[][] dp = new int[n][3];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        // Initialize the dp table for day 1.
        for (int j = 0; j < 3; ++j) {
            dp[0][j] = points[0][j];
        }
        // Populate the dp table from day 2.
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (j == 0) {
                    dp[i][j] = points[i][j] + Math.max(dp[i - 1][1], dp[i - 1][2]);
                }
                if (j == 1) {
                    dp[i][j] = points[i][j] + Math.max(dp[i - 1][0], dp[i - 1][2]);
                }
                if (j == 2) {
                    dp[i][j] = points[i][j] + Math.max(dp[i - 1][0], dp[i - 1][1]);
                }
            }
        }

        int maxMerit = 0;
        for (int j = 0; j < 3; ++j) {
            maxMerit = Math.max(maxMerit, dp[n - 1][j]);
        }
        return maxMerit;
    }

    public static int solveByTabulation2(int n, int[][] points) {
        int[][] dp = new int[n][4];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        // Initialize the dp table for day 1.
        dp[n - 1][0] = Math.max(points[n - 1][1], points[n - 1][2]); // Previous action is 0.
        dp[n - 1][1] = Math.max(points[n - 1][0], points[n - 1][2]); // Previous action is 1.
        dp[n - 1][2] = Math.max(points[n - 1][0], points[n - 1][1]); // Previous action is 2.
        dp[n - 1][3] = Math.max(points[n - 1][0], Math.max(points[n - 1][1], points[n - 1][2])); // Previous action is 3.
        // Populate the dp table from day 2.
        for (int i = n - 2; i >= 0; --i) {
            for (int j = 0; j < 4; ++j) { // Previous action type
                int maxMerit = 0;
                if (j != 0) {
                    maxMerit = Math.max(maxMerit, points[i][0] + dp[i + 1][0]);
                }
                if (j != 1) {
                    maxMerit = Math.max(maxMerit, points[i][1] + dp[i + 1][1]);
                }
                if (j != 2) {
                    maxMerit = Math.max(maxMerit, points[i][2] + dp[i + 1][2]);
                }
                dp[i][j] = maxMerit;
            }
        }

        return dp[0][3];
    }
}
