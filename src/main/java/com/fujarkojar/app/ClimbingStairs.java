package com.fujarkojar.app;

import java.util.Arrays;

public class ClimbingStairs {
    public static long solveByMemoization(int nStairs) {
        long[] dp = new long[nStairs + 1];
        Arrays.fill(dp, -1);
        return helper(nStairs, dp);
    }

    private static long helper(int ind, long[] dp) {
        if (ind == 0) {
            return 1;
        }
        if (ind < 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = (helper(ind - 1, dp) + helper(ind - 2, dp)) % 1000000007;
        return dp[ind];
    }

    public static long solveByTabulation(int nStairs) {
        if (nStairs == 1) {
            return 1;
        }
        if (nStairs == 2) {
            return 2;
        }
        long prev2 = 1;
        long prev1 = 2;
        for (int i = nStairs; i >= 3; --i) {
            long cur = (prev1 + prev2) % 1000000007;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
