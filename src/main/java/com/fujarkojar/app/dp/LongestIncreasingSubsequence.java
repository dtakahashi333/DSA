package com.fujarkojar.app.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static int solveByBruteForce(int[] arr) {
        List<Integer> lst = new ArrayList<>();
        return helperByBruteForce(arr, 0, lst);
    }

    private static int helperByBruteForce(int[] arr, int ind, List<Integer> lst) {
        if (ind > arr.length - 1) {
            if (!lst.isEmpty()) {
                int prev = lst.get(0);
                for (int i = 1; i < lst.size(); ++i) {
                    int cur = lst.get(i);
                    if (lst.get(i) <= prev) {
                        return 0;
                    }
                    prev = cur;
                }
            }
            return lst.size();
        }
        lst.add(arr[ind]); // Taken
        int left = helperByBruteForce(arr, ind + 1, lst);
        lst.remove(Integer.valueOf(arr[ind])); // Not taken
        int right = helperByBruteForce(arr, ind + 1, lst);
        return Math.max(left, right);
    }

    public static int solveByMemoization(int[] arr) {
        int[][] dp = new int[arr.length][arr.length + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(arr, 0, -1, dp);
    }

    private static int helperByMemoization(int[] arr, int ind, int prevInd, int[][] dp) {
        if (ind > arr.length - 1) {
            return 0;
        }
        if (dp[ind][prevInd + 1] != -1) {
            return dp[ind][prevInd + 1];
        }
        int len = helperByMemoization(arr, ind + 1, prevInd, dp); // Not take
        if (prevInd == -1 || arr[ind] > arr[prevInd]) {
            len = Math.max(len, 1 + helperByMemoization(arr, ind + 1, ind, dp)); // Take
        }
        dp[ind][prevInd + 1] = len;
        return len;
    }

//    def longest_increasing_subsequence(arr):
//        if not arr:
//            return 0
//
//        N = len(arr)
//        dp = [1] * N  # Each element is at least an LIS of length 1 (itself)
//
//        for i in range(1, N):
//            for j in range(i):
//                if arr[i] > arr[j]:
//                    dp[i] = max(dp[i], dp[j] + 1)
//
//        # The length of the longest increasing subsequence
//        return max(dp)
//
//    # Example usage:
//    arr = [10, 9, 2, 5, 3, 7, 101, 18]
//    print(longest_increasing_subsequence(arr))  # Output: 4 (The subsequence is [2, 3, 7, 101])

    public static int solveByTabulation(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int N = arr.length;
        int[] dp = new int[N];
        Arrays.fill(dp, 1); // Each element is at least an LIS of length 1 (itself).

        for (int i = 1; i < N; ++i) {
            for (int j = 0; j < i; ++j) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // The length of the longest increasing subsequence.
        return Arrays.stream(dp).max().getAsInt();
    }
}
