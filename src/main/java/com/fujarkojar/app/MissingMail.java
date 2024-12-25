package com.fujarkojar.app;

import java.util.Arrays;

public class MissingMail {

    public static double getMaxExpectedProfitByMemoization(int N, int[] V, int C, double S) {
        double[][] dp = new double[N][N + 1]; // N * prevPickups
        for (double[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(N, V, C, S, 0, 0, -1, dp);
    }

    private static double helperByMemoization(int N, int[] V, int C, double S, int ind, double carryOver, int prevPickUp, double[][] dp) {
        if (ind == N - 1) {
            if (carryOver + V[ind] > C) {
                return carryOver + V[ind] - C;
            } else {
                return 0;
            }
        }
        // Memorization
        if (dp[ind][prevPickUp + 1] >= 0) {
            return dp[ind][prevPickUp + 1];
        }
        dp[ind][prevPickUp + 1] = Math.max(
                carryOver + V[ind] - C + helperByMemoization(N, V, C, S, ind + 1, 0, ind, dp), // Take
                helperByMemoization(N, V, C, S, ind + 1, (carryOver + V[ind]) * (1 - S), prevPickUp, dp) // Not take
        );
        return dp[ind][prevPickUp + 1];
    }
}
