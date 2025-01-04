package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixChainMultiplicationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int T = 2;
        int[] N = {4, 4};
        int[][] arr = {{4, 5, 3, 2}, {10, 15, 20, 25}};
        int[] A = {70, 8000};
        int[] output = new int[T];
        for (int t = 0; t < T; ++t) {
            output[t] = MatrixChainMultiplication.solveByMemoization(arr[t], N[t]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByMemoization2() {
        int T = 1;
        int[] N = {4};
        int[][] arr = {{1, 4, 3, 2}};
        int[] A = {18};
        int[] output = new int[T];
        for (int t = 0; t < T; ++t) {
            output[t] = MatrixChainMultiplication.solveByMemoization(arr[t], N[t]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByTabulation1() {
        int T = 2;
        int[] N = {4, 4};
        int[][] arr = {{4, 5, 3, 2}, {10, 15, 20, 25}};
        int[] A = {70, 8000};
        int[] output = new int[T];
        for (int t = 0; t < T; ++t) {
            output[t] = MatrixChainMultiplication.solveByTabulation(arr[t], N[t]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByTabulation2() {
        int T = 1;
        int[] N = {4};
        int[][] arr = {{1, 4, 3, 2}};
        int[] A = {18};
        int[] output = new int[T];
        for (int t = 0; t < T; ++t) {
            output[t] = MatrixChainMultiplication.solveByTabulation(arr[t], N[t]);
        }
        assertArrayEquals(A, output);
    }
}