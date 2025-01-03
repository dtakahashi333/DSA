package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByMemoization1() {
        int n = 4;
        int[] weight = new int[]{1, 2, 4, 5};
        int[] value = new int[]{5, 4, 8, 6,};
        int maxWeight = 5;
        assertEquals(13, Knapsack.solveByMemoization(weight, value, n, maxWeight));
    }

    @Test
    void solveByMemoization2() {
        int n = 1;
        int[] weight = new int[]{6};
        int[] value = new int[]{1};
        int maxWeight = 78;
        assertEquals(1, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 7;
        weight = new int[]{6, 5, 1, 5, 6, 5, 9};
        value = new int[]{5, 3, 4, 9, 6, 1, 1};
        maxWeight = 63;
        assertEquals(29, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 7;
        weight = new int[]{1, 5, 6, 9, 7, 9, 7};
        value = new int[]{1, 7, 1, 5, 1, 7, 7};
        maxWeight = 37;
        assertEquals(28, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{3};
        value = new int[]{4};
        maxWeight = 13;
        assertEquals(4, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{7};
        value = new int[]{1};
        maxWeight = 1;
        assertEquals(0, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{10};
        value = new int[]{8};
        maxWeight = 85;
        assertEquals(8, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 3;
        weight = new int[]{7, 6, 9};
        value = new int[]{3, 3, 5};
        maxWeight = 51;
        assertEquals(11, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{9};
        value = new int[]{6};
        maxWeight = 52;
        assertEquals(6, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{1};
        value = new int[]{4};
        maxWeight = 53;
        assertEquals(4, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 9;
        weight = new int[]{3, 9, 3, 8, 8, 7, 9, 5, 10};
        value = new int[]{5, 1, 6, 10, 1, 6, 3, 7, 5};
        maxWeight = 83;
        assertEquals(44, Knapsack.solveByMemoization(weight, value, n, maxWeight));
    }

    @Test
    void solveByMemoization3() {
        int n = 35;
        int[] weight = new int[]{25, 4, 25, 49, 9, 11, 31, 5, 37, 7, 11, 47, 37, 1, 33, 25, 29, 11, 1, 41, 19, 14, 43, 21, 1, 21, 23, 37, 12, 11, 45, 13, 36, 11, 17};
        int[] value = new int[]{86, 55, 17, 31, 88, 82, 27, 57, 18, 1, 61, 56, 36, 82, 51, 85, 55, 21, 11, 76, 91, 36, 85, 32, 99, 43, 41, 61, 41, 28, 83, 27, 35, 61, 16};
        int maxWeight = 869;
        assertEquals(1775, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 38;
        weight = new int[]{3, 4, 32, 33, 23, 21, 11, 25, 39, 37, 17, 19, 40, 11, 32, 31, 1, 25, 34, 20, 15, 42, 48, 15, 35, 42, 34, 38, 26, 4, 37, 47, 11, 29, 35, 22, 31, 31};
        value = new int[]{66, 73, 96, 51, 21, 76, 69, 93, 25, 34, 53, 39, 59, 92, 31, 61, 89, 65, 17, 34, 77, 89, 9, 29, 46, 43, 6, 41, 72, 53, 11, 49, 13, 95, 49, 23, 28, 51};
        maxWeight = 781;
        assertEquals(1832, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 27;
        weight = new int[]{35, 45, 21, 9, 13, 25, 37, 38, 36, 41, 21, 46, 43, 1, 4, 34, 31, 41, 39, 27, 5, 1, 33, 38, 1, 27, 1};
        value = new int[]{11, 39, 61, 61, 67, 1, 7, 81, 29, 5, 21, 1, 1, 65, 28, 1, 23, 33, 79, 1, 13, 45, 41, 51, 28, 49, 79};
        maxWeight = 451;
        assertEquals(904, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 38;
        weight = new int[]{9, 16, 17, 35, 44, 13, 5, 20, 36, 11, 9, 31, 9, 45, 31, 31, 21, 10, 6, 41, 45, 33, 18, 7, 35, 41, 1, 22, 3, 11, 33, 1, 3, 29, 1, 5, 45, 40};
        value = new int[]{41, 17, 82, 36, 78, 21, 22, 5, 81, 45, 61, 77, 67, 91, 1, 41, 77, 6, 96, 61, 45, 99, 71, 81, 21, 47, 5, 61, 91, 55, 33, 90, 69, 24, 75, 19, 41, 91};
        maxWeight = 994;
        assertEquals(2024, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 45;
        weight = new int[]{26, 17, 35, 34, 1, 26, 44, 1, 15, 25, 1, 17, 8, 29, 47, 6, 47, 1, 21, 17, 7, 44, 27, 23, 49, 41, 50, 47, 26, 41, 7, 3, 1, 31, 1, 15, 7, 17, 13, 29, 41, 11, 17, 23, 8};
        value = new int[]{45, 36, 33, 77, 31, 1, 95, 53, 1, 85, 79, 50, 89, 76, 8, 11, 87, 81, 37, 31, 88, 1, 27, 57, 29, 51, 33, 77, 11, 91, 8, 1, 79, 59, 56, 61, 61, 21, 13, 61, 79, 61, 87, 61, 53};
        maxWeight = 511;
        assertEquals(1843, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 37;
        weight = new int[]{13, 17, 30, 43, 31, 11, 19, 23, 3, 17, 50, 21, 41, 21, 29, 35, 21, 8, 5, 11, 1, 39, 23, 43, 31, 11, 6, 15, 44, 27, 35, 49, 13, 29, 32, 1, 7};
        value = new int[]{5, 81, 79, 13, 99, 44, 16, 41, 5, 27, 38, 26, 61, 75, 53, 1, 59, 86, 51, 11, 1, 21, 75, 1, 81, 81, 83, 22, 57, 1, 88, 6, 44, 41, 63, 12, 51};
        maxWeight = 879;
        assertEquals(1599, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 27;
        weight = new int[]{6, 19, 50, 11, 21, 15, 24, 31, 29, 23, 26, 11, 46, 44, 24, 24, 31, 47, 35, 36, 18, 13, 43, 33, 4, 43, 12};
        value = new int[]{3, 71, 43, 41, 58, 21, 26, 66, 61, 85, 85, 4, 33, 19, 51, 3, 17, 2, 57, 1, 52, 21, 61, 61, 85, 93, 53};
        maxWeight = 463;
        assertEquals(1070, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 48;
        weight = new int[]{28, 25, 43, 22, 11, 33, 21, 10, 13, 33, 13, 17, 43, 1, 48, 4, 44, 43, 33, 40, 3, 21, 3, 27, 21, 29, 25, 17, 29, 5, 21, 29, 29, 43, 43, 11, 4, 49, 47, 17, 27, 29, 34, 45, 9, 23, 21, 31};
        value = new int[]{66, 73, 11, 65, 31, 91, 81, 41, 37, 29, 53, 21, 21, 33, 61, 77, 79, 72, 41, 81, 86, 1, 56, 98, 47, 30, 95, 65, 81, 14, 71, 13, 89, 75, 91, 32, 58, 87, 87, 1, 34, 51, 61, 69, 6, 1, 33, 61};
        maxWeight = 523;
        assertEquals(1724, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 44;
        weight = new int[]{17, 15, 41, 35, 21, 27, 28, 17, 11, 4, 6, 21, 41, 27, 13, 47, 37, 30, 21, 1, 15, 6, 1, 43, 45, 39, 12, 5, 23, 1, 39, 1, 21, 31, 41, 47, 35, 31, 7, 7, 20, 17, 16, 8};
        value = new int[]{91, 66, 87, 25, 35, 65, 1, 31, 57, 45, 80, 43, 97, 16, 55, 89, 29, 29, 47, 37, 73, 50, 77, 1, 41, 17, 90, 1, 89, 26, 97, 93, 26, 51, 71, 7, 52, 56, 3, 39, 33, 85, 33, 37};
        maxWeight = 646;
        assertEquals(2009, Knapsack.solveByMemoization(weight, value, n, maxWeight));
        n = 29;
        weight = new int[]{30, 3, 43, 25, 20, 21, 2, 34, 39, 48, 14, 35, 15, 46, 49, 15, 11, 26, 38, 33, 1, 21, 17, 1, 44, 44, 33, 17, 33};
        value = new int[]{1, 13, 75, 46, 87, 98, 31, 91, 23, 43, 85, 18, 35, 1, 83, 26, 77, 91, 85, 76, 74, 65, 35, 36, 98, 42, 37, 83, 54};
        maxWeight = 424;
        assertEquals(1335, Knapsack.solveByMemoization(weight, value, n, maxWeight));
    }

    @Test
    void solveByTabulation1() {
        int n = 4;
        int[] weight = new int[]{1, 2, 4, 5};
        int[] value = new int[]{5, 4, 8, 6,};
        int maxWeight = 5;
        assertEquals(13, Knapsack.solveByTabulation(weight, value, n, maxWeight));
    }

    @Test
    void solveByTabulation2() {
        int n = 1;
        int[] weight = new int[]{6};
        int[] value = new int[]{1};
        int maxWeight = 78;
        assertEquals(1, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 7;
        weight = new int[]{6, 5, 1, 5, 6, 5, 9};
        value = new int[]{5, 3, 4, 9, 6, 1, 1};
        maxWeight = 63;
        assertEquals(29, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 7;
        weight = new int[]{1, 5, 6, 9, 7, 9, 7};
        value = new int[]{1, 7, 1, 5, 1, 7, 7};
        maxWeight = 37;
        assertEquals(28, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{3};
        value = new int[]{4};
        maxWeight = 13;
        assertEquals(4, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{7};
        value = new int[]{1};
        maxWeight = 1;
        assertEquals(0, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{10};
        value = new int[]{8};
        maxWeight = 85;
        assertEquals(8, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 3;
        weight = new int[]{7, 6, 9};
        value = new int[]{3, 3, 5};
        maxWeight = 51;
        assertEquals(11, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{9};
        value = new int[]{6};
        maxWeight = 52;
        assertEquals(6, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 1;
        weight = new int[]{1};
        value = new int[]{4};
        maxWeight = 53;
        assertEquals(4, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 9;
        weight = new int[]{3, 9, 3, 8, 8, 7, 9, 5, 10};
        value = new int[]{5, 1, 6, 10, 1, 6, 3, 7, 5};
        maxWeight = 83;
        assertEquals(44, Knapsack.solveByTabulation(weight, value, n, maxWeight));
    }

    @Test
    void solveByTabulation3() {
        int n = 35;
        int[] weight = new int[]{25, 4, 25, 49, 9, 11, 31, 5, 37, 7, 11, 47, 37, 1, 33, 25, 29, 11, 1, 41, 19, 14, 43, 21, 1, 21, 23, 37, 12, 11, 45, 13, 36, 11, 17};
        int[] value = new int[]{86, 55, 17, 31, 88, 82, 27, 57, 18, 1, 61, 56, 36, 82, 51, 85, 55, 21, 11, 76, 91, 36, 85, 32, 99, 43, 41, 61, 41, 28, 83, 27, 35, 61, 16};
        int maxWeight = 869;
        assertEquals(1775, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 38;
        weight = new int[]{3, 4, 32, 33, 23, 21, 11, 25, 39, 37, 17, 19, 40, 11, 32, 31, 1, 25, 34, 20, 15, 42, 48, 15, 35, 42, 34, 38, 26, 4, 37, 47, 11, 29, 35, 22, 31, 31};
        value = new int[]{66, 73, 96, 51, 21, 76, 69, 93, 25, 34, 53, 39, 59, 92, 31, 61, 89, 65, 17, 34, 77, 89, 9, 29, 46, 43, 6, 41, 72, 53, 11, 49, 13, 95, 49, 23, 28, 51};
        maxWeight = 781;
        assertEquals(1832, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 27;
        weight = new int[]{35, 45, 21, 9, 13, 25, 37, 38, 36, 41, 21, 46, 43, 1, 4, 34, 31, 41, 39, 27, 5, 1, 33, 38, 1, 27, 1};
        value = new int[]{11, 39, 61, 61, 67, 1, 7, 81, 29, 5, 21, 1, 1, 65, 28, 1, 23, 33, 79, 1, 13, 45, 41, 51, 28, 49, 79};
        maxWeight = 451;
        assertEquals(904, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 38;
        weight = new int[]{9, 16, 17, 35, 44, 13, 5, 20, 36, 11, 9, 31, 9, 45, 31, 31, 21, 10, 6, 41, 45, 33, 18, 7, 35, 41, 1, 22, 3, 11, 33, 1, 3, 29, 1, 5, 45, 40};
        value = new int[]{41, 17, 82, 36, 78, 21, 22, 5, 81, 45, 61, 77, 67, 91, 1, 41, 77, 6, 96, 61, 45, 99, 71, 81, 21, 47, 5, 61, 91, 55, 33, 90, 69, 24, 75, 19, 41, 91};
        maxWeight = 994;
        assertEquals(2024, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 45;
        weight = new int[]{26, 17, 35, 34, 1, 26, 44, 1, 15, 25, 1, 17, 8, 29, 47, 6, 47, 1, 21, 17, 7, 44, 27, 23, 49, 41, 50, 47, 26, 41, 7, 3, 1, 31, 1, 15, 7, 17, 13, 29, 41, 11, 17, 23, 8};
        value = new int[]{45, 36, 33, 77, 31, 1, 95, 53, 1, 85, 79, 50, 89, 76, 8, 11, 87, 81, 37, 31, 88, 1, 27, 57, 29, 51, 33, 77, 11, 91, 8, 1, 79, 59, 56, 61, 61, 21, 13, 61, 79, 61, 87, 61, 53};
        maxWeight = 511;
        assertEquals(1843, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 37;
        weight = new int[]{13, 17, 30, 43, 31, 11, 19, 23, 3, 17, 50, 21, 41, 21, 29, 35, 21, 8, 5, 11, 1, 39, 23, 43, 31, 11, 6, 15, 44, 27, 35, 49, 13, 29, 32, 1, 7};
        value = new int[]{5, 81, 79, 13, 99, 44, 16, 41, 5, 27, 38, 26, 61, 75, 53, 1, 59, 86, 51, 11, 1, 21, 75, 1, 81, 81, 83, 22, 57, 1, 88, 6, 44, 41, 63, 12, 51};
        maxWeight = 879;
        assertEquals(1599, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 27;
        weight = new int[]{6, 19, 50, 11, 21, 15, 24, 31, 29, 23, 26, 11, 46, 44, 24, 24, 31, 47, 35, 36, 18, 13, 43, 33, 4, 43, 12};
        value = new int[]{3, 71, 43, 41, 58, 21, 26, 66, 61, 85, 85, 4, 33, 19, 51, 3, 17, 2, 57, 1, 52, 21, 61, 61, 85, 93, 53};
        maxWeight = 463;
        assertEquals(1070, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 48;
        weight = new int[]{28, 25, 43, 22, 11, 33, 21, 10, 13, 33, 13, 17, 43, 1, 48, 4, 44, 43, 33, 40, 3, 21, 3, 27, 21, 29, 25, 17, 29, 5, 21, 29, 29, 43, 43, 11, 4, 49, 47, 17, 27, 29, 34, 45, 9, 23, 21, 31};
        value = new int[]{66, 73, 11, 65, 31, 91, 81, 41, 37, 29, 53, 21, 21, 33, 61, 77, 79, 72, 41, 81, 86, 1, 56, 98, 47, 30, 95, 65, 81, 14, 71, 13, 89, 75, 91, 32, 58, 87, 87, 1, 34, 51, 61, 69, 6, 1, 33, 61};
        maxWeight = 523;
        assertEquals(1724, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 44;
        weight = new int[]{17, 15, 41, 35, 21, 27, 28, 17, 11, 4, 6, 21, 41, 27, 13, 47, 37, 30, 21, 1, 15, 6, 1, 43, 45, 39, 12, 5, 23, 1, 39, 1, 21, 31, 41, 47, 35, 31, 7, 7, 20, 17, 16, 8};
        value = new int[]{91, 66, 87, 25, 35, 65, 1, 31, 57, 45, 80, 43, 97, 16, 55, 89, 29, 29, 47, 37, 73, 50, 77, 1, 41, 17, 90, 1, 89, 26, 97, 93, 26, 51, 71, 7, 52, 56, 3, 39, 33, 85, 33, 37};
        maxWeight = 646;
        assertEquals(2009, Knapsack.solveByTabulation(weight, value, n, maxWeight));
        n = 29;
        weight = new int[]{30, 3, 43, 25, 20, 21, 2, 34, 39, 48, 14, 35, 15, 46, 49, 15, 11, 26, 38, 33, 1, 21, 17, 1, 44, 44, 33, 17, 33};
        value = new int[]{1, 13, 75, 46, 87, 98, 31, 91, 23, 43, 85, 18, 35, 1, 83, 26, 77, 91, 85, 76, 74, 65, 35, 36, 98, 42, 37, 83, 54};
        maxWeight = 424;
        assertEquals(1335, Knapsack.solveByTabulation(weight, value, n, maxWeight));
    }
}