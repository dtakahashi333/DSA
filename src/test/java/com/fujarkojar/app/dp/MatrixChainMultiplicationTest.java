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
        for (int t = 0; t < T; ++t) {
            assertEquals(A[t], MatrixChainMultiplication.solveByMemoization(arr[t], N[t]));
        }
    }

    @Test
    void solveByMemoization2() {
        int T = 1;
        int[] N = {4};
        int[][] arr = {{1, 4, 3, 2}};
        int[] A = {18};
        for (int t = 0; t < T; ++t) {
            assertEquals(A[t], MatrixChainMultiplication.solveByMemoization(arr[t], N[t]));
        }
    }

    @Test
    void solveByTabulation1() {
        int T = 2;
        int[] N = {4, 4};
        int[][] arr = {{4, 5, 3, 2}, {10, 15, 20, 25}};
        int[] A = {70, 8000};
        for (int t = 0; t < T; ++t) {
            assertEquals(A[t], MatrixChainMultiplication.solveByTabulation(arr[t], N[t]));
        }
    }

    @Test
    void solveByTabulation2() {
        int T = 1;
        int[] N = {4};
        int[][] arr = {{1, 4, 3, 2}};
        int[] A = {18};
        for (int t = 0; t < T; ++t) {
            assertEquals(A[t], MatrixChainMultiplication.solveByTabulation(arr[t], N[t]));
        }
    }
}