package com.fujarkojar.app.dp;

import java.util.Arrays;

// N-th Fibonacci Number
// https://www.naukri.com/code360/problems/nth-fibonacci-number_1115780?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&attempt_status=ATTEMPTED&customSource=studio_nav
// https://cp-algorithms.com/algebra/fibonacci-numbers.html
public class FibonacciNumber {

    public static int solveByMemoization(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helperByMemoization(n, dp);
    }

    private static int helperByMemoization(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = (helperByMemoization(n - 1, dp) + helperByMemoization(n - 2, dp)) % 1000000007;
        return dp[n];
    }

    public static int solveByTabulation(int n) {
        int prev2 = 0;
        int prev1 = 1;
        for (int i = 2; i <= n; ++i) {
            int cur = (prev1 + prev2) % 1000000007;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
