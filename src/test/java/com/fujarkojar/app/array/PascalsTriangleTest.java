package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int numRows = 5;
        Integer[][] arr = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solve(numRows));
    }

    @Test
    void solve2() {
        int numRows = 1;
        Integer[][] arr = {{1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solve(numRows));
    }

    @Test
    void solveByRecursion1() {
        int numRows = 5;
        Integer[][] arr = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solveByRecursion(numRows));
    }

    @Test
    void solveByRecursion2() {
        int numRows = 1;
        Integer[][] arr = {{1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solveByRecursion(numRows));
    }

    @Test
    void solve2_1() {
        int numRows = 5;
        Integer[][] arr = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solve2(numRows));
    }

    @Test
    void solve2_2() {
        int numRows = 1;
        Integer[][] arr = {{1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solve2(numRows));
    }

    @Test
    void solve3_1() {
        int numRows = 5;
        Integer[][] arr = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solve3(numRows));
    }

    @Test
    void solve3_2() {
        int numRows = 1;
        Integer[][] arr = {{1}};
        List<List<Integer>> expected = new ArrayList<>();
        for (Integer[] a : arr) {
            expected.add(Arrays.asList(a));
        }
        assertIterableEquals(expected, PascalsTriangle.solve3(numRows));
    }
}