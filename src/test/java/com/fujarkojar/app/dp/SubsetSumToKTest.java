package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Subset Sum Equal To K
// https://www.naukri.com/code360/problems/subset-sum-equal-to-k_1550954?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM&count=25&page=3&search=&sort_entity=order&sort_order=ASC&attempt_status=COMPLETED&customSource=studio_nav
class SubsetSumToKTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int[] arr = {4, 3, 2, 1};
        int n = arr.length;
        int k = 5;
        boolean expected = true;
        assertEquals(expected, SubsetSumToK.solveByMemoization(n, k, arr));
    }

    @Test
    void solveByMemoization2() {
        int[] arr = {2, 5, 1, 6, 7};
        int n = arr.length;
        int k = 4;
        boolean expected = false;
        assertEquals(expected, SubsetSumToK.solveByMemoization(n, k, arr));
    }

    @Test
    void solveByMemoization3() {
        int[] arr = {6, 1, 2, 1};
        int n = arr.length;
        int k = 4;
        boolean expected = true;
        assertEquals(expected, SubsetSumToK.solveByMemoization(n, k, arr));
    }

    @Test
    void solveByMemoization4() {
        int[] arr = {1, 7, 2, 9, 10};
        int n = arr.length;
        int k = 6;
        boolean expected = false;
        assertEquals(expected, SubsetSumToK.solveByMemoization(n, k, arr));
    }

    @Test
    void solveByTabulation1() {
        int[] arr = {4, 3, 2, 1};
        int n = arr.length;
        int k = 5;
        boolean expected = true;
        assertEquals(expected, SubsetSumToK.solveByTabulation(n, k, arr));
    }

    @Test
    void solveByTabulation2() {
        int[] arr = {2, 5, 1, 6, 7};
        int n = arr.length;
        int k = 4;
        boolean expected = false;
        assertEquals(expected, SubsetSumToK.solveByTabulation(n, k, arr));
    }

    @Test
    void solveByTabulation3() {
        int[] arr = {6, 1, 2, 1};
        int n = arr.length;
        int k = 4;
        boolean expected = true;
        assertEquals(expected, SubsetSumToK.solveByTabulation(n, k, arr));
    }

    @Test
    void solveByTabulation4() {
        int[] arr = {1, 7, 2, 9, 10};
        int n = arr.length;
        int k = 6;
        boolean expected = false;
        assertEquals(expected, SubsetSumToK.solveByTabulation(n, k, arr));
    }
}