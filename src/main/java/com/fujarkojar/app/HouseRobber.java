package com.fujarkojar.app;

import java.util.Arrays;

public class HouseRobber {

    public static int solveByMemoization(int[] houses) {
        int[] dp = new int[houses.length];
        Arrays.fill(dp, -1);
        return helperByMemoization(houses, 0, dp);
    }

    private static int helperByMemoization(int[] houses, int ind, int[] dp) {
        if (ind > houses.length - 1) {
            return 0;
        }
        // Memoization
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = Math.max(
                houses[ind] + helperByMemoization(houses, ind + 2, dp), // Take
                helperByMemoization(houses, ind + 1, dp) // Not take
        ) % 1000000007;
        return dp[ind];
    }

    public static int solveByTabulation(int[] houses) {
        if (houses.length == 0) {
            return 0;
        }
        if (houses.length == 1) {
            return houses[0];
        }

        // Tabulation
        int[] dp = new int[houses.length];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);
        for (int i = 2; i < houses.length; ++i) {
            dp[i] = Math.max(houses[i] + dp[i - 2], dp[i - 1]) % 1000000007;
        }

        return dp[dp.length - 1];
    }
}
