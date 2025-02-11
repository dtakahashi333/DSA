package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] a = {1, 2, 4, 5};
        int N = 5;
        int expected = 3;
        assertEquals(expected, MissingNumber.solve(a, N));
    }

    @Test
    void solve2() {
        int[] a = {1, 2, 3};
        int N = 4;
        int expected = 4;
        assertEquals(expected, MissingNumber.solve(a, N));
    }

    @Test
    void solve3() {
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int N = 8;
        int expected = 4;
        assertEquals(expected, MissingNumber.solve(a, N));
    }

    @Test
    void solveBySum1() {
        int[] a = {1, 2, 4, 5};
        int N = 5;
        int expected = 3;
        assertEquals(expected, MissingNumber.solveBySum(a, N));
    }

    @Test
    void solveBySum2() {
        int[] a = {1, 2, 3};
        int N = 4;
        int expected = 4;
        assertEquals(expected, MissingNumber.solveBySum(a, N));
    }

    @Test
    void solveBySum3() {
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int N = 8;
        int expected = 4;
        assertEquals(expected, MissingNumber.solveBySum(a, N));
    }

    @Test
    void solveByXOR1() {
        int[] a = {1, 2, 4, 5};
        int N = 5;
        int expected = 3;
        assertEquals(expected, MissingNumber.solveByXOR(a, N));
    }

    @Test
    void solveByXOR2() {
        int[] a = {1, 2, 3};
        int N = 4;
        int expected = 4;
        assertEquals(expected, MissingNumber.solveByXOR(a, N));
    }

    @Test
    void solveByXOR3() {
        int[] a = {1, 2, 3, 5, 6, 7, 8};
        int N = 8;
        int expected = 4;
        assertEquals(expected, MissingNumber.solveByXOR(a, N));
    }
}