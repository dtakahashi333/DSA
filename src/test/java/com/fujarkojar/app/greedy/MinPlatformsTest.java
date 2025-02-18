package com.fujarkojar.app.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPlatformsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int expected = 3;
        assertEquals(expected, MinPlatforms.solveByBruteForce(arr, dep));
    }

    @Test
    void solveByBruteForce2() {
        int[] arr = {900, 1235, 1100};
        int[] dep = {1000, 1240, 1200};
        int expected = 1;
        assertEquals(expected, MinPlatforms.solveByBruteForce(arr, dep));
    }

    @Test
    void solveByBruteForce3() {
        int[] arr = {1000, 935, 1100};
        int[] dep = {1200, 1240, 1130};
        int expected = 3;
        assertEquals(expected, MinPlatforms.solveByBruteForce(arr, dep));
    }

    @Test
    void solveByGreedy1() {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int expected = 3;
        assertEquals(expected, MinPlatforms.solveByGreedy(arr, dep));
    }

    @Test
    void solveByGreedy2() {
        int[] arr = {900, 1235, 1100};
        int[] dep = {1000, 1240, 1200};
        int expected = 1;
        assertEquals(expected, MinPlatforms.solveByGreedy(arr, dep));
    }

    @Test
    void solveByGreedy3() {
        int[] arr = {1000, 935, 1100};
        int[] dep = {1200, 1240, 1130};
        int expected = 3;
        assertEquals(expected, MinPlatforms.solveByGreedy(arr, dep));
    }

    @Test
    void solveByGreedy4() {
        int[] arr = {2153, 659, 1721, 1025, 602, 1531, 1832, 829};
        int[] dep = {2204, 1832, 1949, 2034, 1141, 2033, 1844, 1926};
        int expected = 6;
        assertEquals(expected, MinPlatforms.solveByGreedy(arr, dep));
    }
}