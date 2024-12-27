package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int[] valueInHouse = new int[]{0};
        assertEquals(0, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{2, 3, 2};
        assertEquals(3, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{1, 3, 2, 1};
        assertEquals(4, HouseRobber2.solveByMemoization(valueInHouse));
    }

    @Test
    void solveByMemoization2() {
        int[] valueInHouse = new int[]{1, 5, 1, 2, 6};
        assertEquals(11, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{2, 3, 5};
        assertEquals(5, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{1, 3, 2, 0};
        assertEquals(3, HouseRobber2.solveByMemoization(valueInHouse));
    }

    @Test
    void solveByMemoization3() {
        int[] valueInHouse = new int[]{100};
        assertEquals(100, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{0, 9, 1, 8, 2, 3, 6, 4, 5, 7};
        assertEquals(31, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{6, 5, 4, 3, 2, 1, 7};
        assertEquals(15, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{1, 7, 14, 21, 13};
        assertEquals(28, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 30, 11, 7, 15};
        assertEquals(98, HouseRobber2.solveByMemoization(valueInHouse));
    }

    @Test
    void solveByMemoization4() {
        int[] valueInHouse = new int[]{0};
        assertEquals(0, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{13, 24, 34, 47, 56, 61, 73, 84, 99};
        assertEquals(262, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{0, 0, 0, 0, 0};
        assertEquals(0, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{100, 101, 2};
        assertEquals(101, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{59, 53, 41, 26, 17, 13, 11};
        assertEquals(117, HouseRobber2.solveByMemoization(valueInHouse));
        valueInHouse = new int[]{1, 3, 2, 4};
        assertEquals(7, HouseRobber2.solveByMemoization(valueInHouse));
    }

    @Test
    void solveByTabulation1() {
        int[] valueInHouse = new int[]{0};
        assertEquals(0, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{2, 3, 2};
        assertEquals(3, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{1, 3, 2, 1};
        assertEquals(4, HouseRobber2.solveByTabulation(valueInHouse));
    }

    @Test
    void solveByTabulation2() {
        int[] valueInHouse = new int[]{1, 5, 1, 2, 6};
        assertEquals(11, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{2, 3, 5};
        assertEquals(5, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{1, 3, 2, 0};
        assertEquals(3, HouseRobber2.solveByTabulation(valueInHouse));
    }

    @Test
    void solveByTabulation3() {
        int[] valueInHouse = new int[]{100};
        assertEquals(100, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{0, 9, 1, 8, 2, 3, 6, 4, 5, 7};
        assertEquals(31, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{6, 5, 4, 3, 2, 1, 7};
        assertEquals(15, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{1, 7, 14, 21, 13};
        assertEquals(28, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 30, 11, 7, 15};
        assertEquals(98, HouseRobber2.solveByTabulation(valueInHouse));
    }

    @Test
    void solveByTabulation4() {
        int[] valueInHouse = new int[]{0};
        assertEquals(0, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{13, 24, 34, 47, 56, 61, 73, 84, 99};
        assertEquals(262, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{0, 0, 0, 0, 0};
        assertEquals(0, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{100, 101, 2};
        assertEquals(101, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{59, 53, 41, 26, 17, 13, 11};
        assertEquals(117, HouseRobber2.solveByTabulation(valueInHouse));
        valueInHouse = new int[]{1, 3, 2, 4};
        assertEquals(7, HouseRobber2.solveByTabulation(valueInHouse));
    }
}