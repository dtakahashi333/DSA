package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization() {
        int t = 2;
        int[] nStairs = {2, 3, 4, 5};
        int[] expected = {2, 3, 5, 8};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], ClimbingStairs.solveByMemoization(nStairs[i]));
        }
    }

    @Test
    void solveByTabulation() {
        int t = 2;
        int[] nStairs = {2, 3, 4, 5};
        int[] expected = {2, 3, 5, 8};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], ClimbingStairs.solveByTabulation(nStairs[i]));
        }
    }
}