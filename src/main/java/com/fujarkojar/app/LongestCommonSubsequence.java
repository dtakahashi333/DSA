package com.fujarkojar.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSubsequence {

    public static int solveByBruteForce(String s, String t) {
        // Get all subsequences recursively from s.
        List<String> sLst = new ArrayList<>();
        helperByBruteForce(s, 0, "", sLst);
        // Get all subsequences recursively from t.
        List<String> tLst = new ArrayList<>();
        helperByBruteForce(t, 0, "", tLst);

        int maxLen = 0;
        for (String sSub : sLst) {
            for (String tSub : tLst) {
                if (sSub.equals(tSub)) {
                    if (sSub.length() > maxLen) {
                        maxLen = sSub.length();
                    }
                }
            }
        }

        return maxLen;
    }

    private static void helperByBruteForce(String str, int ind, String sub, List<String> lst) {
        if (ind > str.length() - 1) {
            lst.add(sub);
            return;
        }
        // Not take.
        helperByBruteForce(str, ind + 1, sub, lst);
        // Take.
        helperByBruteForce(str, ind + 1, sub + str.charAt(ind), lst);
    }

    public static int solveByMemoization(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(s, s.length() - 1, t, t.length() - 1, dp);
    }

    private static int helperByMemoization(String s, int i, String t, int j, int[][] dp) {
        if (i < 0 || j < 0) { // Base case
            return 0;
        }
        // Memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = 1 + helperByMemoization(s, i - 1, t, j - 1, dp);
        } else {
            dp[i][j] = Math.max(
                    helperByMemoization(s, i - 1, t, j, dp),
                    helperByMemoization(s, i, t, j - 1, dp)
            );
        }
        return dp[i][j];
    }
}
