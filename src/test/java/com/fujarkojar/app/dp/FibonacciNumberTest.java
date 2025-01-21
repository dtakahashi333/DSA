package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int t = 4;
        int[] n = {10, 7, 1, 3};
        int[] expected = {55, 13, 1, 2};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByMemoization(n[i]));
        }
    }

    @Test
    void solveByMemoization2() {
        int t = 5;
        int[] n = {95, 93, 22, 93, 9};
        int[] expected = {407059028, 720754435, 17711, 720754435, 34};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByMemoization(n[i]));
        }
    }

    @Test
    void solveByMemoization3() {
        int t = 5;
        int[] n = {2, 3, 4, 999, 1000};
        int[] expected = {1, 2, 3, 589888339, 517691607};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByMemoization(n[i]));
        }
    }

    @Test
    void solveByMemoization4() {
        int t = 5;
        int[] n = {65, 21, 64, 90, 27};
        int[] expected = {680057396, 10946, 209783453, 210345902, 196418};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByMemoization(n[i]));
        }
    }

    @Test
    void solveByMemoization5() {
        int t = 5;
        int[] n = {7761, 8697, 775, 9485, 8011};
        int[] expected = {685468122, 196002846, 18180091, 175085347, 875674385};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByMemoization(n[i]));
        }
    }

    @Test
    void solveByTabulation1() {
        int t = 4;
        int[] n = {10, 7, 1, 3};
        int[] expected = {55, 13, 1, 2};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByTabulation(n[i]));
        }
    }

    @Test
    void solveByTabulation2() {
        int t = 5;
        int[] n = {95, 93, 22, 93, 9};
        int[] expected = {407059028, 720754435, 17711, 720754435, 34};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByTabulation(n[i]));
        }
    }

    @Test
    void solveByTabulation3() {
        int t = 5;
        int[] n = {2, 3, 4, 999, 1000};
        int[] expected = {1, 2, 3, 589888339, 517691607};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByTabulation(n[i]));
        }
    }

    @Test
    void solveByTabulation4() {
        int t = 5;
        int[] n = {65, 21, 64, 90, 27};
        int[] expected = {680057396, 10946, 209783453, 210345902, 196418};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByTabulation(n[i]));
        }
    }

    @Test
    void solveByTabulation5() {
        int t = 5;
        int[] n = {7761, 8697, 775, 9485, 8011};
        int[] expected = {685468122, 196002846, 18180091, 175085347, 875674385};
        for (int i = 0; i < t; ++i) {
            assertEquals(expected[i], FibonacciNumber.solveByTabulation(n[i]));
        }
    }
}