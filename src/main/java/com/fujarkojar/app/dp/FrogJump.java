package com.fujarkojar.app.dp;

import java.util.Arrays;

public class FrogJump {

    public static int solveByMemoization(int n, int[] heights) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helperByMemoization(heights, n - 1, dp);
    }

    private static int helperByMemoization(int[] heights, int ind, int[] dp) {
        if (ind == 0) {
            return 0;
        }

        // Memoization
        if (dp[ind] != -1) {
            return dp[ind];
        }

        // 1 jump
        int oneJump = Math.abs(heights[ind] - heights[ind - 1]) + helperByMemoization(heights, ind - 1, dp);

        // 2 jumps
        int twoJumps = Integer.MAX_VALUE;
        if (ind >= 2) {
            twoJumps = Math.abs(heights[ind] - heights[ind - 2]) + helperByMemoization(heights, ind - 2, dp);
        }

        dp[ind] = Math.min(oneJump, twoJumps);

        return dp[ind];
    }

    public static int solveByTabulation(int n, int[] heights) {
//        int[] dp = new int[n];
//        Arrays.fill(dp, -1);
//        dp[0] = 0;
        int prev1 = 0, prev2 = 0;
        for (int i = 1; i < n; ++i) {
            // 1 jump
            int oneJump = Math.abs(heights[i] - heights[i - 1]) + prev1; //dp[i - 1];

            // 2 jumps
            int twoJumps = Integer.MAX_VALUE;
            if (i >= 2) {
                twoJumps = Math.abs(heights[i] - heights[i - 2]) + prev2; //dp[i - 2];
            }

//            dp[i] = Math.min(oneJump, twoJumps);
            int cur = Math.min(oneJump, twoJumps);
            prev2 = prev1;
            prev1 = cur;
        }

        return prev1; //dp[n - 1];
    }
}
