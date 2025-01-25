package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DijkstrasAlgorithmTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[][][] adj = {
                {{1, 4}, {2, 4}},
                {{0, 4}, {2, 2}},
                {{0, 4}, {1, 2}, {3, 3}, {4, 1}, {5, 6}},
                {{3, 3}, {5, 2}},
                {{2, 1}, {5, 3}},
                {{2, 6}, {3, 2}, {4, 3}}
        };
        int src = 0;
        Integer[] expected = {0, 4, 4, 7, 5, 8};
        assertIterableEquals(
                new ArrayList<Integer>(Arrays.asList(expected)),
                DijkstrasAlgorithm.solve(WeightedAdjacencyList.fromArray(adj), src));
    }

    @Test
    void solve2() {
        int[][][] adj = {{{1, 9}}, {{0, 9}}};
        int src = 0;
        Integer[] expected = {0, 9};
        assertIterableEquals(
                new ArrayList<Integer>(Arrays.asList(expected)),
                DijkstrasAlgorithm.solve(WeightedAdjacencyList.fromArray(adj), src));
    }

    @Test
    void solve3() {
        int[][][] adj = {{{1, 1}, {2, 6}}, {{2, 3}, {0, 1}}, {{1, 3}, {0, 6}}};
        int src = 2;
        Integer[] expected = {4, 3, 0};
        assertIterableEquals(
                new ArrayList<Integer>(Arrays.asList(expected)),
                DijkstrasAlgorithm.solve(WeightedAdjacencyList.fromArray(adj), src));
    }
}