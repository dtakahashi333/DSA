package com.fujarkojar.app.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMeetingsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByGreedy1() {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int expected = 4;
        assertEquals(expected, MaxMeetings.solveByGreedy(start, end));
    }

    @Test
    void solveByGreedy2() {
        int[] start = {10, 12, 20};
        int[] end = {20, 25, 30};
        int expected = 1;
        assertEquals(expected, MaxMeetings.solveByGreedy(start, end));
    }

    @Test
    void solveByGreedy3() {
        int[] start = {1, 2};
        int[] end = {100, 99};
        int expected = 1;
        assertEquals(expected, MaxMeetings.solveByGreedy(start, end));
    }

    @Test
    void solveByMemoization1() {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int expected = 4;
        assertEquals(expected, MaxMeetings.solveByMemoization(start, end));
    }

    @Test
    void solveByMemoization2() {
        int[] start = {10, 12, 20};
        int[] end = {20, 25, 30};
        int expected = 1;
        assertEquals(expected, MaxMeetings.solveByMemoization(start, end));
    }

    @Test
    void solveByMemoization3() {
        int[] start = {1, 2};
        int[] end = {100, 99};
        int expected = 1;
        assertEquals(expected, MaxMeetings.solveByMemoization(start, end));
    }
}