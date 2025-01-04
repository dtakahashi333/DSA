package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumPathSumTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization() {
        int T = 2;
        int[][][] grid = {{{5, 9, 6}, {11, 5, 2}}, {{5}}};
        int[] A = {21, 5};
        int[] output = new int[T];
        for (int i = 0; i < T; ++i) {
            output[i] = MinimumPathSum.solveByMemoization(grid[i]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByTabulation() {
        int T = 2;
        int[][][] grid = {{{5, 9, 6}, {11, 5, 2}}, {{5}}};
        int[] A = {21, 5};
        int[] output = new int[T];
        for (int i = 0; i < T; ++i) {
            output[i] = MinimumPathSum.solveByTabulation(grid[i]);
        }
        assertArrayEquals(A, output);
    }
}