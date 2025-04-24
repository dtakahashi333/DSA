package com.fujarkojar.app.graph;

import java.util.Arrays;

// G-46. Disjoint Set | Union by Rank | Union by Size | Path Compression
// https://www.youtube.com/watch?v=aBxjDBC4M1U
public class DisjointSet {

    private final int[] rank;
    private final int[] parent;

    public DisjointSet(int n) {
        this.rank = new int[n + 1];
        Arrays.fill(this.rank, 0);
        this.parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            this.parent[i] = i;
        }
    }

    public int findUltimateParent(int u) {
        if (u > this.parent.length - 1) throw new IllegalArgumentException();
        if (u == this.parent[u]) return u;
        this.parent[u] = findUltimateParent(this.parent[u]);
        return this.parent[u];
    }

    public void unionByRank(int u, int v) {
        if (u > this.parent.length - 1|| v > this.parent.length - 1) throw new IllegalArgumentException();
        if (u == v) return;
        int ultimateParentU = findUltimateParent(u);
        int ultimateParentV = findUltimateParent(v);
        if (ultimateParentU == ultimateParentV) return;
        if (this.rank[ultimateParentU] < this.rank[ultimateParentV]) this.parent[u] = ultimateParentV;
        else if (this.rank[ultimateParentU] > this.rank[ultimateParentV]) this.parent[v] = ultimateParentU;
        else {
            this.parent[v] = ultimateParentU;
            this.rank[ultimateParentU]++;
        }
    }
}
