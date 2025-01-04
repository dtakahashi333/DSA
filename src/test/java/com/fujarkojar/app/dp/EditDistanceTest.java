package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int T = 1;
        String[] str1 = {"horse"};
        String[] str2 = {"ros"};
        int[] A = {3};
        int[] output = new int[T];
        for (int i = 0; i < T; ++i) {
            output[i] = EditDistance.solveByMemoization(str1[i], str2[i]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByMemoization2() {
        int T = 2;
        String[] str1 = {"abc", "whgtdwhgtdg"};
        String[] str2 = {"dc", "aswcfg"};
        int[] A = {2, 9};
        int[] output = new int[T];
        for (int i = 0; i < T; ++i) {
            output[i] = EditDistance.solveByMemoization(str1[i], str2[i]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByMemoization3() {
        int T = 1;
        String[] str1 = {"acdefgd"};
        String[] str2 = {"aawdfg"};
        int[] A = {4};
        int[] output = new int[T];
        for (int i = 0; i < T; ++i) {
            output[i] = EditDistance.solveByMemoization(str1[i], str2[i]);
        }
        assertArrayEquals(A, output);
    }

    @Test
    void solveByMemoization4() {
        int T = 1;
        String[] str1 = {"wncpoddas"};
        String[] str2 = {"wqegesggfff"};
        int[] A = {10};
        int[] output = new int[T];
        for (int i = 0; i < T; ++i) {
            output[i] = EditDistance.solveByMemoization(str1[i], str2[i]);
        }
        assertArrayEquals(A, output);
    }
}