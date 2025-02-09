package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        Integer[] arr = {8, 9, 4, 5};
        int k = 3;
        int expected = -1;
        assertEquals(expected, SearchInRotatedSortedArray.solve(new ArrayList<>(Arrays.asList(arr)), arr.length, k));
    }

    @Test
    void solve2() {
        Integer[] arr = {2, 3, 5, 8};
        int k = 3;
        int expected = 1;
        assertEquals(expected, SearchInRotatedSortedArray.solve(new ArrayList<>(Arrays.asList(arr)), arr.length, k));
    }

    @Test
    void solve3() {
        Integer[] arr = {11, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int expected = 1;
        assertEquals(expected, SearchInRotatedSortedArray.solve(new ArrayList<>(Arrays.asList(arr)), arr.length, k));
    }
}