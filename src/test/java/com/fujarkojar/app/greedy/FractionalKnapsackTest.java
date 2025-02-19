package com.fujarkojar.app.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FractionalKnapsackTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        Integer[] val = {60, 100, 120};
        Integer[] wt = {10, 20, 30};
        int capacity = 50;
        double expected = 240.000000;
        assertEquals(expected, FractionalKnapsack.solve(Arrays.asList(val), Arrays.asList(wt), capacity));
    }

    @Test
    void solve2() {
        Integer[] val = {60, 100};
        Integer[] wt = {10, 20};
        int capacity = 50;
        double expected = 160.000000;
        assertEquals(expected, FractionalKnapsack.solve(Arrays.asList(val), Arrays.asList(wt), capacity));
    }

    @Test
    void solve3() {
        Integer[] val = {10, 20, 30};
        Integer[] wt = {5, 10, 15};
        int capacity = 100;
        double expected = 60.000000;
        assertEquals(expected, FractionalKnapsack.solve(Arrays.asList(val), Arrays.asList(wt), capacity));
    }
}