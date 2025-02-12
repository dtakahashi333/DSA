package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int m = 3;
        int n = 2;
        int expected = 3;
        assertEquals(expected, UniquePaths.solveByMemoization(m, n));
    }

    @Test
    void solveByMemoization2() {
        int m = 3;
        int n = 7;
        int expected = 28;
        assertEquals(expected, UniquePaths.solveByMemoization(m, n));
    }

    @Test
    void solveByTabulation1() {
        int m = 3;
        int n = 2;
        int expected = 3;
        assertEquals(expected, UniquePaths.solveByTabulation(m, n));
    }

    @Test
    void solveByTabulation2() {
        int m = 3;
        int n = 7;
        int expected = 28;
        assertEquals(expected, UniquePaths.solveByTabulation(m, n));
    }
}