package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KosarajusAlgorithmTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[][] adj = {{2, 3}, {0}, {1}, {4}, {}};
        int expected = 3;
        assertEquals(expected, KosarajusAlgorithm.solve(AdjacencyList.fromArray(adj)));
    }

    @Test
    void solve2() {
        int[][] adj = {{1}, {2}, {0}};
        int expected = 1;
        assertEquals(expected, KosarajusAlgorithm.solve(AdjacencyList.fromArray(adj)));
    }

    @Test
    void solve3() {
        int[][] adj = {{1}, {}};
        int expected = 2;
        assertEquals(expected, KosarajusAlgorithm.solve(AdjacencyList.fromArray(adj)));
    }

    @Test
    void solve4() {
        int[][] adj = {{1}, {2}, {0, 3}, {4}, {5, 7}, {6}, {4, 7}, {}};
        int expected = 4;
        assertEquals(expected, KosarajusAlgorithm.solve(AdjacencyList.fromArray(adj)));
    }
}