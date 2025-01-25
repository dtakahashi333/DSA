package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithMaxProductTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        int[] arr = {1, -2, 3, -4};
        int expected = 24;
        assertEquals(expected, SubarrayWithMaxProduct.solveByBruteForce(arr));
    }

    @Test
    void solveByBruteForce2() {
        int[] arr = {-1, 3, 0, -4, 3};
        int expected = 3;
        assertEquals(expected, SubarrayWithMaxProduct.solveByBruteForce(arr));
    }

    @Test
    void solveByOptimal1() {
        int[] arr = {1, -2, 3, -4};
        int expected = 24;
        assertEquals(expected, SubarrayWithMaxProduct.solveByOptimal(arr));
    }

    @Test
    void solveByOptimal2() {
        int[] arr = {-1, 3, 0, -4, 3};
        int expected = 3;
        assertEquals(expected, SubarrayWithMaxProduct.solveByOptimal(arr));
    }
}