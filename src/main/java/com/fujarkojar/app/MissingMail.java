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

    public static double getMaxExpectedProfitByTabulation(int N, int[] V, int C, double S) {
        double[][] dp = new double[N][N];
        for (double[] a : dp) {
            Arrays.fill(a, -1);
        }
        dp[N - 1][N - 1] = V[N - 1] - C;
        for (int i = N - 2; i >= 0; --i) {
            double max = Integer.MIN_VALUE;
            for (int j = i + 1, k = 1; j < N; ++j, ++k) {
                if (dp[i + 1][j] > max) {
                    max = dp[i + 1][j];
                }
                dp[i][j] = dp[i + 1][j] + V[i] * Math.pow(1 - S, k);
            }
            dp[i][i] = V[i] - C + Math.max(max, 0);
        }

        double maxProfit = 0;
        for (int j = 0; j < N; ++j) {
            if (dp[0][j] > maxProfit) {
                maxProfit = dp[0][j];
            }
        }

        return maxProfit;

//        double[] maxProfit = new double[N];
//        Arrays.fill(maxProfit, Integer.MIN_VALUE);
//
//        double[][] dp = new double[N][N];
//        for (double[] a : dp) {
//            Arrays.fill(a, -1);
//        }
//
//        // Base case
//        maxProfit[0] = V[0] - C;
//        dp[0][0] = V[0];
//
//        for (int j = 1; j < N; ++j) {
//            double carryOver = 0;
//            for (int i = 0; i < j; ++i) {
//                dp[i][j] = dp[i][j - 1] * (1 - S);
//                carryOver += dp[i][j];
//            }
//            if (maxProfit[j - 1] < carryOver) {
//                // To make it a profit, the carry-over needs to be realized.
//                maxProfit[j] = carryOver + V[j] - C; //
//            } else {
//                maxProfit[j] = maxProfit[j - 1];
//                if (V[j] - C > 0) {
//                    maxProfit[j] += V[j] - C; // Take
//                }
//            }
//            dp[j][j] = V[j]; // Set a raw value for the future estimation.
//        }
//
//        return Math.max(maxProfit[N - 1], 0);
    }

}
