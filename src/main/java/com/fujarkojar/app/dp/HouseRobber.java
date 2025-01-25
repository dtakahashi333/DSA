package com.fujarkojar.app.dp;

import java.util.Arrays;

// House Robber
// https://www.naukri.com/code360/problems/house-robber_6211018?interviewProblemRedirection=true&attempt_status=COMPLETED
// https://takeuforward.org/data-structure/dynamic-programming-house-robber-dp-6/
// https://www.youtube.com/watch?v=3WaxQMELSkw&t=1s
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
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return houses[0];
        }

        // Tabulation
        int[] dp = new int[N];
        Arrays.fill(dp, -1);

        dp[0] = houses[0];
        dp[1] = Math.max(dp[0], houses[1]);
        for (int i = 2; i < N; ++i) {
            dp[i] = Math.max(
                    dp[i - 1], // Not take
                    houses[i] + dp[i - 2]
            ) % 1000000007; // Take
        }
        return dp[N - 1];
    }
}
