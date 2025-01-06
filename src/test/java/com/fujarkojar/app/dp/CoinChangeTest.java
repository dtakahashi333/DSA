package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int t = 3;
        int[][] coins = {{1, 2, 5}, {2}, {1}};
        int[] amount = {11, 3, 0};
        int[] expected = {3, -1, 0};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = CoinChange.solveByMemoization(coins[i], amount[i]);
        }
        assertArrayEquals(expected, output);
    }

    @Test
    void solveByMemoization2() {
        int t = 1;
        int[][] coins = {{186, 419, 83, 408}};
        int[] amount = {6249};
        int[] expected = {20};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = CoinChange.solveByMemoization(coins[i], amount[i]);
        }
        assertArrayEquals(expected, output);
    }

    @Test
    void solveByBruteForce1() {
        int t = 3;
        int[][] coins = {{1, 2, 5}, {2}, {1}};
        int[] amount = {11, 3, 0};
        int[] expected = {3, -1, 0};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = CoinChange.solveByBruteForce(coins[i], amount[i]);
        }
        assertArrayEquals(expected, output);
    }

    @Test
    void solveByBruteForce2() {
        int t = 1;
        int[][] coins = {{186, 419, 83, 408}};
        int[] amount = {6249};
        int[] expected = {20};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = CoinChange.solveByBruteForce(coins[i], amount[i]);
        }
        assertArrayEquals(expected, output);
    }

    @Test
    void solveByTabulation1() {
        int t = 3;
        int[][] coins = {{1, 2, 5}, {2}, {1}};
        int[] amount = {11, 3, 0};
        int[] expected = {3, -1, 0};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = CoinChange.solveByTabulation(coins[i], amount[i]);
        }
        assertArrayEquals(expected, output);
    }

    @Test
    void solveByTabulation2() {
        int t = 1;
        int[][] coins = {{186, 419, 83, 408}};
        int[] amount = {6249};
        int[] expected = {20};
        int[] output = new int[t];
        for (int i = 0; i < t; ++i) {
            output[i] = CoinChange.solveByTabulation(coins[i], amount[i]);
        }
        assertArrayEquals(expected, output);
    }
}