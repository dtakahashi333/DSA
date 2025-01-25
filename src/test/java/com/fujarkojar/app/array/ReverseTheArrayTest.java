package com.fujarkojar.app.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTheArrayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        int m = 3;
        Integer[] expected = {1, 2, 3, 4, 6, 5};
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
        ReverseTheArray.solve(arrList, m);
        assertIterableEquals(new ArrayList<Integer>(Arrays.asList(expected)), arrList);
    }

    @Test
    void solve2() {
        Integer[] arr = {10, 9, 8, 7, 6};
        int m = 2;
        Integer[] expected = {10, 9, 8, 6, 7};
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
        ReverseTheArray.solve(arrList, m);
        assertIterableEquals(new ArrayList<Integer>(Arrays.asList(expected)), arrList);
    }

    @Test
    void solve3() {
        Integer[] arr = {1, 4, 5, 6, 6, 7, 7};
        int m = 3;
        Integer[] expected = {1, 4, 5, 6, 7, 7, 6};
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
        ReverseTheArray.solve(arrList, m);
        assertIterableEquals(new ArrayList<Integer>(Arrays.asList(expected)), arrList);
    }

    @Test
    void solve4() {
        Integer[] arr = {10, 4, 5, 2, 3, 6, 1, 3, 6};
        int m = 3;
        Integer[] expected = {10, 4, 5, 2, 6, 3, 1, 6, 3};
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
        ReverseTheArray.solve(arrList, m);
        assertIterableEquals(new ArrayList<Integer>(Arrays.asList(expected)), arrList);
    }
}