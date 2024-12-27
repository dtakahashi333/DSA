package com.fujarkojar.app;

import java.util.Arrays;

public class HouseRobber2 {

    public static long solveByMemoization(int[] valueInHouse) {
        long[][] dp = new long[2][valueInHouse.length];
        for (long[] a : dp) {
            Arrays.fill(a, -1);
        }
        return Math.max(
                valueInHouse[0] + helperByMemoization(valueInHouse, 0, 2, dp),
                helperByMemoization(valueInHouse, 1, 1, dp)
        );
    }

    private static long helperByMemoization(int[] valueInHouse, int startInd, int ind, long[][] dp) {
        if (startInd == 0 && ind > valueInHouse.length - 2) {
            return 0;
        }
        if (startInd == 1 && ind > valueInHouse.length - 1) {
            return 0;
        }
        // Memoization
        if (dp[startInd][ind] != -1) {
            return dp[startInd][ind];
        }
        dp[startInd][ind] = Math.max(
                valueInHouse[ind] + helperByMemoization(valueInHouse, startInd, ind + 2, dp),
                helperByMemoization(valueInHouse, startInd, ind + 1, dp)
        );
        return dp[startInd][ind];
    }

    public static long solveByTabulation(int[] valueInHouse) {
        int n = valueInHouse.length;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return valueInHouse[0];
        }

        int[] temp1 = new int[n - 1];
        int[] temp2 = new int[n - 1];
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                temp1[i - 1] = valueInHouse[i];
            }
            if (i < n - 1) {
                temp2[i] = valueInHouse[i];
            }
        }
        int ans1 = HouseRobber.solveByTabulation(temp1);
        int ans2 = HouseRobber.solveByTabulation(temp2);
        return Math.max(ans1, ans2);
    }
}
