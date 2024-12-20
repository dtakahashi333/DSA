package com.fujarkojar.app;

import java.util.Arrays;

public class HouseRobber {
    public static int solveByMemoization(int[] a) {
        int[] dp = new int[a.length];
        Arrays.fill(dp, -1);
        return helper(a, 0, dp);
    }

    private static int helper(int[] a, int ind, int[] dp) {
        if (ind > a.length - 1) {
            return 0;
        }
        if (ind == a.length - 1) {
            return a[ind];
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = Math.max(
                a[ind] + helper(a, ind + 2, dp), // Taken
                helper(a, ind + 1, dp) // Not taken
        ) % 1000000007;
        return dp[ind];
    }

    public static int solveByTabulation(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        if (a.length == 2) {
            return Math.max(a[0], a[1]);
        }
        int[] dp = new int[a.length];
        Arrays.fill(dp, -1);
        dp[0] = a[0];
        dp[1] = Math.max(a[0], a[1]);
        for (int i = 2; i < a.length; ++i) {
            dp[i] = Math.max(a[i] + dp[i - 2], dp[i - 1]) % 1000000007;
        }
        return dp[a.length - 1];
    }
}
