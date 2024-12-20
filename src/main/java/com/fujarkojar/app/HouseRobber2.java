package com.fujarkojar.app;

import java.util.Arrays;

public class HouseRobber2 {
    public static long solveByMemoization(int[] valueInHouse) {
        long[] dp0 = new long[valueInHouse.length];
        long[] dp1 = new long[valueInHouse.length];
        Arrays.fill(dp0, -1);
        Arrays.fill(dp1, -1);
        return Math.max(
                valueInHouse[0] + helper0(valueInHouse, 2, dp0),
                helper1(valueInHouse, 1, dp1)
        ) % 1000000007;
    }

    // Starts at index 0.
    private static long helper0(int[] valueInHouse, int ind, long[] dp) {
        if (ind > valueInHouse.length - 2) {
            return 0;
        }
        if (ind == valueInHouse.length - 2) {
            return valueInHouse[ind];
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = Math.max(
                valueInHouse[ind] + helper0(valueInHouse, ind + 2, dp), // Taken
                helper0(valueInHouse, ind + 1, dp) // Not taken
        ) % 1000000007;
        return dp[ind];
    }

    // Starts at index 1.
    private static long helper1(int[] valueInHouse, int ind, long[] dp) {
        if (ind > valueInHouse.length - 1) {
            return 0;
        }
        if (ind == valueInHouse.length - 1) {
            return valueInHouse[ind];
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = Math.max(
                valueInHouse[ind] + helper0(valueInHouse, ind + 2, dp), // Taken
                helper0(valueInHouse, ind + 1, dp) // Not taken
        ) % 1000000007;
        return dp[ind];
    }
}
