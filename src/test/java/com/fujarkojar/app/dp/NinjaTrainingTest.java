package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinjaTrainingTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int n = 3;
        int[][] points = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int expected = 11;
        assertEquals(expected, NinjaTraining.solveByMemoization(n, points));
    }

    @Test
    void solveByMemoization2() {
        int n = 3;
        int[][] points = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
        int expected = 210;
        assertEquals(expected, NinjaTraining.solveByMemoization(n, points));
    }

    @Test
    void solveByTabulation1() {
        int n = 3;
        int[][] points = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int expected = 11;
        assertEquals(expected, NinjaTraining.solveByTabulation2(n, points));
    }

    @Test
    void solveByTabulation2() {
        int n = 3;
        int[][] points = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
        int expected = 210;
        assertEquals(expected, NinjaTraining.solveByTabulation2(n, points));
    }
}