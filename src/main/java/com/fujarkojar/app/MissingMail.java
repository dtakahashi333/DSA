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
    }

    public static double getMaxExpectedProfitByMemoization2(int N, int[] V, int C, double S) {
        double[][] dp = new double[N][2];
        for (double[] a : dp) {
            Arrays.fill(a, -1);
        }
        double[] benefit = helperByMemoization2(N, V, C, S, N - 1, dp);
        if (benefit[1] > C) {
            return benefit[0] + benefit[1] - C;
        } else {
            return benefit[0];
        }
    }

    private static double[] helperByMemoization2(int N, int[] V, int C, double S, int ind, double[][] dp) {
        if (ind == 0) { // Base case
            if (V[ind] - C > 0 && V[ind] - C > V[ind] * (1 - S)) {
                return new double[]{V[ind] - C, 0};
            } else {
                // Pick up the package later.
                return new double[]{0, V[ind] * (1 - S)};
            }
        }

//        if (dp[ind][0] != -1 && dp[ind][1] != -1) {
//            return dp[ind];
//        }

        double[] benefit = helperByMemoization2(N, V, C, S, ind - 1, dp);
        if (V[ind] + benefit[1] > C && V[ind] + benefit[1] - C > (V[ind] + benefit[1]) * (1 - S)) {
            dp[ind] = new double[]{benefit[0] + benefit[1] + V[ind] - C, 0}; // Take
        } else {
            if (ind == N - 1) {
                dp[ind] = new double[]{benefit[0], V[ind] + benefit[1]}; // Not take
            } else {
                dp[ind] = new double[]{benefit[0], (V[ind] + benefit[1]) * (1 - S)}; // Not take
            }
        }

        return dp[ind];
    }
}
