package com.fujarkojar.app.dp;

import java.util.Arrays;

// Rod cutting problem
// https://www.naukri.com/code360/problems/rod-cutting-problem_800284?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class RodCutting {

    public static int solveByMemoization(int[] price, int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helperByMemoization(price, n, dp);
    }

    private static int helperByMemoization(int[] price, int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        // Memoization
        if (dp[n] != -1) {
            return dp[n];
        }
        int maxCost = 0;
        for (int i = 1; i <= n; ++i) {
            int cost = price[i - 1] + helperByMemoization(price, n - i, dp);
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        dp[n] = maxCost;
        return maxCost;
    }

    public static int solveByTabulation(int[] price, int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int l = 1; l <= n; ++l) {
            for (int i = 1; i <= l; ++i) {
                int cost = price[i - 1] + dp[l - i];
                if (cost > dp[l]) {
                    dp[l] = cost;
                }
            }
        }
        return dp[n];
    }
}
