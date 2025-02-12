package com.fujarkojar.app.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private List<List<Integer>> arrayToList(int[][] arr) {
        List<List<Integer>> outerList = new ArrayList<>();
        for (int[] ints : arr) {
            List<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            outerList.add(innerList);
        }
        return outerList;
    }

    private int[][] listToArray(List<List<Integer>> list) {
        int[][] arr = new int[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            arr[i] = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); ++j) {
                arr[i][j] = list.get(i).get(j);
            }
        }
        return arr;
    }

    private void sortArray2D(int[][] arr) {
        // Sort contents of each array.
        for (int[] a : arr) {
            Arrays.sort(a);
        }
        // Sorting the 2D array lexicographically based on the inner arrays' elements
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                // Compare lexicographically by using Arrays.compare
                for (int i = 0; i < Math.min(a.length, b.length); ++i) {
                    int comparison = Integer.compare(a[i], b[i]);
                    if (comparison != 0) {
                        return comparison;
                    }
                }
                return Integer.compare(a.length, b.length);
            }
        });
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        int[][] expected = {{2, 2, 3}, {7}};
        int[][] actual = listToArray(CombinationSum.solve(candidates, target));
        sortArray2D(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solve2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        int[][] expected = {{2, 2, 2, 2}, {2, 3, 3}, {3, 5}};
        int[][] actual = listToArray(CombinationSum.solve(candidates, target));
        sortArray2D(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solve3() {
        int[] candidates = {2};
        int target = 1;
        int[][] expected = {};
        int[][] actual = listToArray(CombinationSum.solve(candidates, target));
        sortArray2D(actual);
        assertArrayEquals(expected, actual);
    }
}