package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodCuttingTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int[] price = {2, 5, 7, 8, 10};
        int n = 5;
        int expected = 12;
        assertEquals(expected, RodCutting.solveByMemoization(price, n));
    }

    @Test
    void solveByMemoization2() {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        int expected = 24;
        assertEquals(expected, RodCutting.solveByMemoization(price, n));
    }

    @Test
    void solveByTabulation1() {
        int[] price = {2, 5, 7, 8, 10};
        int n = 5;
        int expected = 12;
        assertEquals(expected, RodCutting.solveByTabulation(price, n));
    }

    @Test
    void solveByTabulation2() {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        int expected = 24;
        assertEquals(expected, RodCutting.solveByTabulation(price, n));
    }

    @Test
    void solveByMemoization2_1() {
        int[] price = {2, 5, 7, 8, 10};
        int n = 5;
        int expected = 12;
        assertEquals(expected, RodCutting.solveByMemoization2(price, n));
    }

    @Test
    void solveByMemoization2_2() {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        int expected = 24;
        assertEquals(expected, RodCutting.solveByMemoization2(price, n));
    }

    @Test
    void solveByTabulation2_1() {
        int[] price = {2, 5, 7, 8, 10};
        int n = 5;
        int expected = 12;
        assertEquals(expected, RodCutting.solveByTabulation2(price, n));
    }

    @Test
    void solveByTabulation2_2() {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;
        int expected = 24;
        assertEquals(expected, RodCutting.solveByTabulation2(price, n));
    }
}