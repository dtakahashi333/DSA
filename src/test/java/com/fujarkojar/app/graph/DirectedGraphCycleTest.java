package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DirectedGraphCycleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solveByDFS1() {
        int[][] adj = {{1}, {2}, {3}, {3}};
        int V = adj.length;
        boolean a = true;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, DirectedGraphCycle.solveByDFS(V, list));
    }

    @Test
    void solveByDFS2() {
        int[][] adj = {{1}, {2}, {}};
        int V = adj.length;
        boolean a = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, DirectedGraphCycle.solveByDFS(V, list));
    }

    @Test
    void solveByDFS3() {
        int[][] adj = {{}, {2}, {}, {0}, {2}, {3}};
        int V = adj.length;
        boolean a = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, DirectedGraphCycle.solveByDFS(V, list));
    }

    @Test
    void solveByDFS4() {
        int[][] adj = {{3, 1}, {3}, {}, {}, {3}};
        int V = adj.length;
        boolean a = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, DirectedGraphCycle.solveByDFS(V, list));
    }

    @Test
    void solveByDFS5() {
        // input
        // 4 4
        // 3 2
        // 1 0
        // 1 2
        // 0 2
        // output
        // 0
        int[][] adj = {{2}, {0, 2}, {}, {2}, {4}};
        int V = adj.length;
        boolean a = false;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] ints : adj) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int anInt : ints) {
                innerList.add(anInt);
            }
            list.add(innerList);
        }
        assertEquals(a, DirectedGraphCycle.solveByDFS(V, list));
    }
}