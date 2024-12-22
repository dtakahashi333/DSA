package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int[] houses = new int[]{10, 2, 3, 11};
        assertEquals(21, HouseRobber.solveByMemoization(houses));
    }

    @Test
    void solveByMemoization2() {
        int[] houses = new int[]{5, 5, 10, 100, 10, 5};
        assertEquals(110, HouseRobber.solveByMemoization(houses));
    }

    @Test
    void solveByMemoization3() {
        int[] houses = new int[]{3718};
        assertEquals(3718, HouseRobber.solveByMemoization(houses));
    }

    @Test
    void solveByMemoization4() {
        int[] houses = new int[]{9583, 8878, 3709, 6449, 6541, 6394, 376, 3126, 5077, 964};
        assertEquals(27503, HouseRobber.solveByMemoization(houses));
    }

    @Test
    void solveByMemoization5() {
        int[] houses = new int[]{1412, 6970, 9998, 1772, 7156, 4482, 2153, 8972, 3811, 902, 6586, 2988, 1417, 5124, 2305, 1344, 6585, 2881, 6369, 4089};
        assertEquals(52202, HouseRobber.solveByMemoization(houses));
    }

    @Test
    void helperByTabulation1() {
        int[] houses = new int[]{10, 2, 3, 11};
        assertEquals(21, HouseRobber.solveByTabulation(houses));
    }

    @Test
    void helperByTabulation2() {
        int[] houses = new int[]{5, 5, 10, 100, 10, 5};
        assertEquals(110, HouseRobber.solveByTabulation(houses));
    }

    @Test
    void helperByTabulation3() {
        int[] houses = new int[]{3718};
        assertEquals(3718, HouseRobber.solveByTabulation(houses));
    }

    @Test
    void helperByTabulation4() {
        int[] houses = new int[]{9583, 8878, 3709, 6449, 6541, 6394, 376, 3126, 5077, 964};
        assertEquals(27503, HouseRobber.solveByTabulation(houses));
    }

    @Test
    void helperByTabulation5() {
        int[] houses = new int[]{1412, 6970, 9998, 1772, 7156, 4482, 2153, 8972, 3811, 902, 6586, 2988, 1417, 5124, 2305, 1344, 6585, 2881, 6369, 4089};
        assertEquals(52202, HouseRobber.solveByTabulation(houses));
    }
}