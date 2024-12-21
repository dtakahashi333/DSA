package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakThePrisonTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        // Test case 1
        int N = 4;
        int M = 4;
        int[] H = new int[]{1, 3, 4};
        int[] V = new int[]{2, 3};
        assertEquals(9, BreakThePrison.solve(N, M, H, V));
    }

    @Test
    void solve2() {
        // Test case 2
        int N = 6;
        int M = 5;
        int[] H = new int[]{2, 4};
        int[] V = new int[]{1, 4};
        assertEquals(4, BreakThePrison.solve(N, M, H, V));
    }

    @Test
    void solve3() {
        // Test case 3
        int N = 10;
        int M = 10;
        int[] H = new int[]{1, 2, 3, 4, 6};
        int[] V = new int[]{9};
        assertEquals(10, BreakThePrison.solve(N, M, H, V));
    }
}