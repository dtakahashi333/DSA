package com.fujarkojar.app.dp;

public class EggDropping {

    public static int solveByMemoization(int n, int k) {
        return helperByMemoization(n, k);
    }

    private static int helperByMemoization(int n, int k) {
        if (k <= 0) {
            return 0;
        }

        int mid = k / 2;

        return 1 + Math.max(
                helperByMemoization(n - 1, mid - 1), // An egg breaks.
                helperByMemoization(n, k - mid) // An egg doesn't break.
        );
    }
}
