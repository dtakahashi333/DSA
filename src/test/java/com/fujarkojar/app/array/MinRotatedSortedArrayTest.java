package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinRotatedSortedArrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] arr = {3, 4, 5, 1, 2};
        int expected = 1;
        assertEquals(expected, MinRotatedSortedArray.solve(arr));
    }

    @Test
    void solve2() {
        int[] arr = {3, 4, 1, 2};
        int expected = 1;
        assertEquals(expected, MinRotatedSortedArray.solve(arr));
    }

    @Test
    void solve3() {
        int[] arr = {25, 30, 5, 10, 15, 20};
        int expected = 5;
        assertEquals(expected, MinRotatedSortedArray.solve(arr));
    }
}