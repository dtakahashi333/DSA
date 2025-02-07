package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubarraySumTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByKadanesAlgorithm1() {
        int n = 9;
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        long expected = 11;
        assertEquals(expected, MaxSubarraySum.solveByKadanesAlgorithm(arr, n));
    }

    @Test
    void solveByKadanesAlgorithm2() {
        int n = 6;
        int[] arr = {10, 20, -30, 40, -50, 60};
        long expected = 60;
        assertEquals(expected, MaxSubarraySum.solveByKadanesAlgorithm(arr, n));
    }

    @Test
    void solveByKadanesAlgorithm3() {
        int n = 3;
        int[] arr = {-3, -5, -6};
        long expected = 0;
        assertEquals(expected, MaxSubarraySum.solveByKadanesAlgorithm(arr, n));
    }

    @Test
    void solve4() {
        int n = 10;
        int[] arr = {18, -6, -6, -5, 7, 10, 16, -6, -2, 0};
        long expected = 34;
        assertEquals(expected, MaxSubarraySum.solveByKadanesAlgorithm(arr, n));
    }
}