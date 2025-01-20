package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BipartiteGraphTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByDFS1() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        boolean expected = false;
        assertEquals(expected, BipartiteGraph.solveByDFS(graph));
    }

    @Test
    void solveByDFS2() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        boolean expected = true;
        assertEquals(expected, BipartiteGraph.solveByDFS(graph));
    }

    @Test
    void solveByBFS1() {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        boolean expected = false;
        assertEquals(expected, BipartiteGraph.solveByBFS(graph));
    }

    @Test
    void solveByBFS2() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        boolean expected = true;
        assertEquals(expected, BipartiteGraph.solveByBFS(graph));
    }
}