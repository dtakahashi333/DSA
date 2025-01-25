package com.fujarkojar.app.dp;

import java.util.Arrays;

// Count Ways To Reach The N-th Stairs
// https://www.naukri.com/code360/problems/count-ways-to-reach-nth-stairs_798650?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
// https://takeuforward.org/data-structure/dynamic-programming-climbing-stairs/
// https://www.youtube.com/watch?v=mLfjzJsN8us&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=3
public class ClimbingStairs {

    public static long solveByMemoization(int nStairs) {
        long[] dp = new long[nStairs + 1];
        Arrays.fill(dp, -1);
        return helperByMemoization(nStairs, dp);
    }

    private static long helperByMemoization(int ind, long[] dp) {
        if (ind == 0) {
            return 1;
        }
        if (ind < 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        dp[ind] = (helperByMemoization(ind - 1, dp) + helperByMemoization(ind - 2, dp)) % 1000000007;
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
