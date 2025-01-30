package com.fujarkojar.app.graph;

import java.util.Arrays;

// Bellman-Ford
// https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=distance-from-the-source-bellman-ford-algorithm
// https://www.youtube.com/watch?v=0vVofAhAYjc
public class BellmanFordAlgorithm {

    public static int[] solve(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, 100000000);
        dist[src] = 0;
        for (int i = 0; i < V - 1; ++i) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if (dist[u] != 100000000) {
                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt; // Relax
                    }
                }
            }
        }
        // Negative cycle detection.
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            if (dist[u] != 100000000) {
                if (dist[u] + wt < dist[v]) {
                    // Still reduces the distance after the (V-1)th iteration meaning the graph contains negative cycles.
                    return new int[]{-1};
                }
            }
        }
        return dist;
    }
}
