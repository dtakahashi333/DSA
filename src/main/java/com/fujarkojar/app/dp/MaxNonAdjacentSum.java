package com.fujarkojar.app.dp;

import java.util.ArrayList;
import java.util.Arrays;

// Maximum sum of non-adjacent elements
// https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
// https://takeuforward.org/data-structure/maximum-sum-of-non-adjacent-elements-dp-5/
// https://www.youtube.com/watch?v=GrMBfJNk_NY
public class MaxNonAdjacentSum {

    public static int solveByMemoization(ArrayList<Integer> nums) {
        int n = nums.size();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helperByMemoization(nums, n - 1, dp);
    }

    private static int helperByMemoization(ArrayList<Integer> nums, int ind, int[] dp) {
        if (ind < 0) {
            return 0;
        }
        if (ind == 0) {
            return nums.get(ind);
        }
        // Memoization
        if (dp[ind] != -1) {
            return dp[ind];
        }
        // Pick the larger sum.
        dp[ind] = Math.max(
                nums.get(ind) + helperByMemoization(nums, ind - 2, dp), // Take
                helperByMemoization(nums, ind - 1, dp) // Not take
        );
        return dp[ind];
    }

    public static int solveByTabulation(ArrayList<Integer> nums) {
        int n = nums.size();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = nums.get(0);
        if (n > 1) {
            dp[1] = Math.max(dp[0], nums.get(1));
            for (int i = 2; i < n; ++i) {
                // Pick the larger sum.
                dp[i] = Math.max(
                        nums.get(i) + dp[i - 2], // Take
                        dp[i - 1] // Not take
                );
            }
        }
        return dp[n - 1];
    }
}
