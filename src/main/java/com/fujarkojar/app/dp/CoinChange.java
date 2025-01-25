package com.fujarkojar.app.dp;

import java.util.Arrays;

// https://leetcode.com/problems/coin-change/
// https://www.naukri.com/code360/problems/minimum-elements_3843091?leftPanelTab=1%3Fsource%3Dyoutube&campaign=striver_dpseries&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dpseries
// https://takeuforward.org/data-structure/coin-change-2-dp-22/
// https://www.youtube.com/watch?v=myPeWb3Y68A&list=PLgUwDviBIf0qUlt5H_kiKYaNSqJ81PMMY&index=21
public class CoinChange {

    // It doesn't follow the standard recursion pattern. Please do not use it.
    public static int solveByBruteForce(int[] coins, int amount) {
        int n = coins.length;
        int minCount = helperByBruteForce(coins, n, amount);
        if (minCount >= (int) 1e9) {
            return -1;
        } else {
            return minCount;
        }
    }

    private static int helperByBruteForce(int[] coins, int n, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return (int) 1e9;
        }

        int minCount = (int) 1e9;
        for (int i = 0; i < n; ++i) {
            int count = 1 + helperByBruteForce(coins, n, amount - coins[i]);
            if (count < minCount) {
                minCount = count;
            }
        }

        return minCount;
    }

    public static int solveByMemoization(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        int minCount = helperByMemoization(coins, n, amount, n - 1, dp);
        if (minCount >= (int) 1e9) {
            return -1;
        } else {
            return minCount;
        }
    }

    private static int helperByMemoization(int[] coins, int n, int amount, int ind, int[][] dp) {
        if (ind == 0) {
            if (amount % coins[ind] == 0) {
                return amount / coins[ind];
            } else {
                return (int) 1e9;
            }
        }

        // Memoization
        if (dp[ind][amount] != -1) {
            return dp[ind][amount];
        }

        // Not take
        int notTake = helperByMemoization(coins, n, amount, ind - 1, dp);

        int take = (int) 1e9;
        if (coins[ind] <= amount) {
            // Take. Do not change the coin index.
            take = 1 + helperByMemoization(coins, n, amount - coins[ind], ind, dp);
        }

        dp[ind][amount] = Math.min(notTake, take);
        return dp[ind][amount];
    }

    public static int solveByTabulation(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        // Base case.
        for (int amt = 0; amt <= amount; ++amt) {
            if (amt % coins[0] == 0) {
                dp[0][amt] = amt / coins[0];
            } else {
                dp[0][amt] = (int) 1e9;
            }
        }

        for (int i = 1; i < n; ++i) {
            for (int amt = 0; amt <= amount; ++amt) {
                // Not take
                int notTake = dp[i - 1][amt];
                // Take
                int take = (int) 1e9;
                if (coins[i] <= amt) {
                    take = 1 + dp[i][amt - coins[i]];
                }
                dp[i][amt] = Math.min(notTake, take);
            }
        }

        if (dp[n - 1][amount] >= (int) 1e9) {
            return -1;
        } else {
            return dp[n - 1][amount];
        }
    }
}
