package com.fujarkojar.app.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JobSequencingTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[] id = {1, 2, 3, 4};
        int[] deadline = {4, 1, 1, 1};
        int[] profit = {20, 1, 40, 30};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{2, 60}));
        assertIterableEquals(expected, JobSequencing.solve(id, deadline, profit));
    }

    @Test
    void solve2() {
        int[] id = {1, 2, 3, 4, 5};
        int[] deadline = {2, 1, 2, 1, 1};
        int[] profit = {100, 19, 27, 25, 15};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{2, 127}));
        assertIterableEquals(expected, JobSequencing.solve(id, deadline, profit));
    }

    @Test
    void solve3() {
        int[] id = {1, 2, 3, 4};
        int[] deadline = {3, 1, 2, 2};
        int[] profit = {50, 10, 20, 30};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(new Integer[]{3, 100}));
        assertIterableEquals(expected, JobSequencing.solve(id, deadline, profit));
    }
}