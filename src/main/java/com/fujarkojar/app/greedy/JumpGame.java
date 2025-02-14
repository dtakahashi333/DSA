package com.fujarkojar.app.greedy;

import java.util.Arrays;

// 55. Jump Game
// https://leetcode.com/problems/jump-game/description/
// https://takeuforward.org/Greedy/jump-game-i
// https://www.youtube.com/watch?v=tZAa_jJ3SwQ
public class JumpGame {

    public static boolean solveByMemoization(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helperByMemoization(nums, n, 0, dp);
    }

    private static boolean helperByMemoization(int[] nums, int n, int ind, int[] dp) {
        if (ind >= n - 1) {
            return true;
        }
        // Memoization
        if (dp[ind] != -1) {
            return dp[ind] == 1;
        }
        boolean canReach = false;
        for (int jump = 1; jump <= nums[ind]; ++jump) {
            canReach |= helperByMemoization(nums, n, ind + nums[ind], dp);
        }
        dp[ind] = canReach ? 1 : 0;
        return canReach;
    }

    public static boolean solveByTabulation(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) {
            boolean canReach = false;
            for (int jump = 1; jump <= Math.min(nums[i], n - 1 - i); ++jump) {
                canReach |= (dp[i + jump] == 1);
            }
            dp[i] = canReach ? 1 : 0;
        }
        return dp[0] == 1;
    }

    public static boolean solveByGreedy(int[] nums) {
        int n = nums.length;
        int canReach = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= canReach) {
                canReach = Math.max(canReach, i + nums[i]);
            } else {
                return false;
            }
        }
        return canReach >= n - 1;
    }
}
