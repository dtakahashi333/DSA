package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisjointSetTest {

    private int num = 7;
    private DisjointSet disjointSet;

    @BeforeEach
    void setUp() {
        this.disjointSet = new DisjointSet(this.num);
        this.disjointSet.unionByRank(1, 2);
        this.disjointSet.unionByRank(2, 3);
        this.disjointSet.unionByRank(4, 5);
        this.disjointSet.unionByRank(6, 7);
        this.disjointSet.unionByRank(5, 6);
    }

    @Test
    void test1() {
        boolean expected = false;
        assertEquals(expected, this.disjointSet.findUltimateParent(3) == this.disjointSet.findUltimateParent(7));
    }

    @Test
    void test2() {
        this.disjointSet.unionByRank(3, 7);
        boolean expected = true;
        assertEquals(expected, this.disjointSet.findUltimateParent(3) == this.disjointSet.findUltimateParent(7));
    }
}