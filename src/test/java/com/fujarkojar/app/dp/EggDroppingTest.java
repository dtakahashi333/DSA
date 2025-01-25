package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EggDroppingTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int n = 1;
        int k = 2;
        int expected = 2;
        assertEquals(expected, EggDropping.solveByMemoization(n, k));
    }
}