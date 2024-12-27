package com.fujarkojar.app.dp;

import java.util.Arrays;

// https://www.naukri.com/code360/problems/shortest-common-supersequence_4244493?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class EditDistance {

    public static int solveByMemoization(String str1, String str2) {
        int N = str1.length();
        int M = str2.length();

        int[][] dp = new int[N][M];
        for (int[] ar : dp) {
            Arrays.fill(ar, -1);
        }

        return helperByMemoization(str1, str2, N - 1, M - 1, dp);
    }

    private static int helperByMemoization(String str1, String str2, int i, int j, int[][] dp) {
        if (i < 0) {
            return j + 1;
        }
        if (j < 0) {
            return i + 1;
        }
        // Memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (str1.charAt(i) == str2.charAt(j)) {
            // No operation is needed.
            dp[i][j] = helperByMemoization(str1, str2, i - 1, j - 1, dp);
        } else {
            // All three operations are allowed.
            dp[i][j] = 1 + Math.min(
                    helperByMemoization(str1, str2, i, j - 1, dp), // insertion
                    Math.min(
                            helperByMemoization(str1, str2, i - 1, j, dp), // deletion
                            helperByMemoization(str1, str2, i - 1, j - 1, dp) // replacement
                    )
            );
        }
        return dp[i][j];
    }
}
