package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UndirectedGraphCycleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByBSF1() {
        int[][] adj = {{1}, {0,2,4}, {1,3}, {2,4}, {1,3}};
        boolean a = true;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, UndirectedGraphCycle.solveByBSF(list));
    }

    @Test
    void solveByBSF2() {
        int[][] adj = {{}, {2}, {1,3}, {2}};
        boolean a = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, UndirectedGraphCycle.solveByBSF(list));
    }

    @Test
    void solveByDFS1() {
        int[][] adj = {{1}, {0,2,4}, {1,3}, {2,4}, {1,3}};
        boolean a = true;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, UndirectedGraphCycle.solveByDFS(list));
    }

    @Test
    void solveByDFS2() {
        int[][] adj = {{}, {2}, {1,3}, {2}};
        boolean a = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, UndirectedGraphCycle.solveByDFS(list));
    }
}