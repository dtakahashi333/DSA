package com.fujarkojar.app.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxSumIncreasingSubsequenceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization() {
        int T = 3;
        int[][] arr = {
                {1, 101, 2, 3, 100},
                {4, 1, 2, 3},
                {4, 1, 2, 4}
        };
        int[] ans = {106, 6, 7};
        for (int i = 0; i < T; ++i) {
            Assertions.assertEquals(ans[i], MaxSumIncreasingSubsequence.solveByMemoization(arr[i]));
        }
    }
}