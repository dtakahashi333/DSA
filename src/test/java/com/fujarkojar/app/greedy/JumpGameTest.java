package com.fujarkojar.app.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean expected = true;
        assertEquals(expected, JumpGame.solveByMemoization(nums));
    }

    @Test
    void solveByMemoization2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean expected = false;
        assertEquals(expected, JumpGame.solveByMemoization(nums));
    }

    @Test
    void solveByTabulation1() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean expected = true;
        assertEquals(expected, JumpGame.solveByTabulation(nums));
    }

    @Test
    void solveByTabulation2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean expected = false;
        assertEquals(expected, JumpGame.solveByTabulation(nums));
    }

    @Test
    void solveByGreedy1() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean expected = true;
        assertEquals(expected, JumpGame.solveByGreedy(nums));
    }

    @Test
    void solveByGreedy2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean expected = false;
        assertEquals(expected, JumpGame.solveByGreedy(nums));
    }

    @Test
    void solveByGreedy3() {
        int[] nums = {2, 0, 0};
        boolean expected = true;
        assertEquals(expected, JumpGame.solveByGreedy(nums));
    }
}