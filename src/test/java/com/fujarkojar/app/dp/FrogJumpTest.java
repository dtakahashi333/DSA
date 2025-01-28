package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int t = 2;
        int[][] heights = {{10, 20, 30, 10}, {10, 50, 10}};
        int[] expected = {20, 0};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FrogJump.solveByMemoization(heights[i].length, heights[i]));
        }
    }

    @Test
    void solveByMemoization2() {
        int t = 2;
        int[][] heights = {{7, 4, 4, 2, 6, 6, 3, 4}, {4, 8, 3, 10, 4, 4}};
        int[] expected = {7, 2};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FrogJump.solveByMemoization(heights[i].length, heights[i]));
        }
    }

    @Test
    void solveByTabulation1() {
        int t = 2;
        int[][] heights = {{10, 20, 30, 10}, {10, 50, 10}};
        int[] expected = {20, 0};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FrogJump.solveByTabulation(heights[i].length, heights[i]));
        }
    }

    @Test
    void solveByTabulation2() {
        int t = 2;
        int[][] heights = {{7, 4, 4, 2, 6, 6, 3, 4}, {4, 8, 3, 10, 4, 4}};
        int[] expected = {7, 2};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FrogJump.solveByTabulation(heights[i].length, heights[i]));
        }
    }
}