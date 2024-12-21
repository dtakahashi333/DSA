package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBruteForce1() {
        String s = "adebc";
        String t = "dcadb";
        assertEquals(3, LongestCommonSubsequence.solveByBruteForce(s, t));
    }

    @Test
    void solveByBruteForce2() {
        String s = "ab";
        String t = "defg";
        assertEquals(0, LongestCommonSubsequence.solveByBruteForce(s, t));
    }

    @Test
    void solveByMemoization1() {
        String s = "adebc";
        String t = "dcadb";
        assertEquals(3, LongestCommonSubsequence.solveByBruteForce(s, t));
    }

    @Test
    void solveByMemoization2() {
        String s = "ab";
        String t = "defg";
        assertEquals(0, LongestCommonSubsequence.solveByBruteForce(s, t));
    }
}