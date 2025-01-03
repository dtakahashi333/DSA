package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KahnsAlgorithmTest {

    @BeforeEach
    void setUp() {
    }

    int[] arrayListToArray(ArrayList<Integer> l) {
        int N = l.size();
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = l.get(i);
        }
        return a;
    }

    ArrayList<ArrayList<Integer>> arrayToAdjacentList(int[][] a) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int[] ints : a) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            adj.add(innerList);
        }
        return adj;
    }

    @Test
    void solve1() {
        int[][] input = {{}, {0}, {0}, {0}};
        int[][] expected = {{3, 2, 1, 0}, {1, 2, 3, 0}, {2, 3, 1, 0}};
        ArrayList<Integer> output = KahnsAlgorithm.solve(arrayToAdjacentList(input));
        assertArrayEquals(expected[1], arrayListToArray(output));
    }

    @Test
    void solve2() {
        int[][] input = {{}, {3}, {3}, {}, {0, 1}, {0, 2}};
        int[][] expected = {{4, 5, 0, 1, 2, 3}, {5, 2, 4, 0, 1, 3}, {4, 5, 1, 0, 2, 3}};
        ArrayList<Integer> output = KahnsAlgorithm.solve(arrayToAdjacentList(input));
        assertArrayEquals(expected[2], arrayListToArray(output));
    }
}