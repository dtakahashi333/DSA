package com.fujarkojar.app.dp;

import java.util.Arrays;

// https://www.naukri.com/code360/problems/house-robber_6211018?interviewProblemRedirection=true&attempt_status=COMPLETED
public class HouseRobber {

    public static int solveByMemoization(int[] houses) {
        int N = houses.length;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return helperByMemoization(houses, N - 1, dp);
    }

    private static int helperByMemoization(int[] houses, int ind, int[] dp) {
        if (ind < 0) {
            return 0;
        }
        if (ind == 0) {
            return houses[0];
        }
        // Memoization
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = Math.max(
                houses[ind] + helperByMemoization(houses, ind - 2, dp), // Take
                helperByMemoization(houses, ind - 1, dp)// Not Take
        ) % 1000000007;
        return dp[ind];
    }

    public static int solveByTabulation(int[] houses) {
        int N = houses.length;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        dp[0] = houses[0];
        for (int i = 1; i < N; ++i) {
            int curValue = dp[i - 1]; // Not take
            if (i > 1) {
                curValue = Math.max(curValue, houses[i] + dp[i - 2]) % 1000000007; // Take
            }
            dp[i] = curValue;
        }
        return dp[N - 1];
    }
}
