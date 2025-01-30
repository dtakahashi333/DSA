package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BellmanFordAlgorithmTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int V = 2;
        int[][] edges = {{0, 1, 9}};
        int src = 0;
        int[] expected = {0, 9};
        assertArrayEquals(expected, BellmanFordAlgorithm.solve(V, edges, src));
    }

    @Test
    void solve2() {
        int V = 3;
        int[][] edges = {{0, 1, 5}, {1, 0, 3}, {1, 2, -1}, {2, 0, 1}};
        int src = 2;
        int[] expected = {1, 6, 0};
        assertArrayEquals(expected, BellmanFordAlgorithm.solve(V, edges, src));
    }

    @Test
    void solve3() {
        int V = 3;
        int[][] edges = {{0, 1, -2}, {1, 2, -1}, {2, 0, 2}};
        int src = 2;
        int[] expected = {-1};
        assertArrayEquals(expected, BellmanFordAlgorithm.solve(V, edges, src));
    }

    @Test
    void solve4() {
        int V = 8;
        int[][] edges = {{1, 0, -4}, {3, 5, -4}, {4, 3, -5}, {5, 3, -10}};
        int src = 1;
        int[] expected = {-4, 0, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000};
        assertArrayEquals(expected, BellmanFordAlgorithm.solve(V, edges, src));
    }
}