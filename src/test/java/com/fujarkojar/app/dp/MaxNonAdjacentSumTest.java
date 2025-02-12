package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxNonAdjacentSumTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        Integer[] nums = {1, 2, 4};
        int expected = 5;
        assertEquals(expected, MaxNonAdjacentSum.solveByMemoization(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByMemoization2() {
        Integer[] nums = {2, 1, 4, 9};
        int expected = 11;
        assertEquals(expected, MaxNonAdjacentSum.solveByMemoization(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByMemoization3() {
        Integer[] nums = {1, 2, 3, 5, 4};
        int expected = 8;
        assertEquals(expected, MaxNonAdjacentSum.solveByMemoization(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByMemoization4() {
        Integer[] nums = {1, 2, 3, 1, 3, 5, 8, 1, 9};
        int expected = 24;
        assertEquals(expected, MaxNonAdjacentSum.solveByMemoization(new ArrayList<>(Arrays.asList(nums))));
    }


    @Test
    void solveByMemoization5() {
        Integer[] nums = {4, 8};
        int expected = 8;
        assertEquals(expected, MaxNonAdjacentSum.solveByMemoization(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByMemoization6() {
        Integer[] nums = {9};
        int expected = 9;
        assertEquals(expected, MaxNonAdjacentSum.solveByMemoization(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByTabulation1() {
        Integer[] nums = {1, 2, 4};
        int expected = 5;
        assertEquals(expected, MaxNonAdjacentSum.solveByTabulation(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByTabulation2() {
        Integer[] nums = {2, 1, 4, 9};
        int expected = 11;
        assertEquals(expected, MaxNonAdjacentSum.solveByTabulation(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByTabulation3() {
        Integer[] nums = {1, 2, 3, 5, 4};
        int expected = 8;
        assertEquals(expected, MaxNonAdjacentSum.solveByTabulation(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByTabulation4() {
        Integer[] nums = {1, 2, 3, 1, 3, 5, 8, 1, 9};
        int expected = 24;
        assertEquals(expected, MaxNonAdjacentSum.solveByTabulation(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByTabulation5() {
        Integer[] nums = {4, 8};
        int expected = 8;
        assertEquals(expected, MaxNonAdjacentSum.solveByTabulation(new ArrayList<>(Arrays.asList(nums))));
    }

    @Test
    void solveByTabulation6() {
        Integer[] nums = {9};
        int expected = 9;
        assertEquals(expected, MaxNonAdjacentSum.solveByTabulation(new ArrayList<>(Arrays.asList(nums))));
    }
}