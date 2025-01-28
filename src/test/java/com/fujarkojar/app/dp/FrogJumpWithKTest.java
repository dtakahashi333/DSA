package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpWithKTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int[] height = {10, 40, 30, 10};
        int k = 2;
        int expected = 40;
        assertEquals(expected, FrogJumpWithK.solveByMemoization(height.length, k, height));
    }

    @Test
    void solveByMemoization2() {
        int[] height = {10, 40, 50, 20, 60};
        int k = 3;
        int expected = 50;
        assertEquals(expected, FrogJumpWithK.solveByMemoization(height.length, k, height));
    }

    @Test
    void solveByTabulation1() {
        int[] height = {10, 40, 30, 10};
        int k = 2;
        int expected = 40;
        assertEquals(expected, FrogJumpWithK.solveByTabulation(height.length, k, height));
    }

    @Test
    void solveByTabulation2() {
        int[] height = {10, 40, 50, 20, 60};
        int k = 3;
        int expected = 50;
        assertEquals(expected, FrogJumpWithK.solveByTabulation(height.length, k, height));
    }
}