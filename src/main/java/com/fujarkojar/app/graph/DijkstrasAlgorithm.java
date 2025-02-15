package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// Dijkstra Algorithm
// https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/0
// https://takeuforward.org/data-structure/dijkstras-algorithm-using-priority-queue-g-32/
// https://takeuforward.org/data-structure/dijkstras-algorithm-using-set-g-33/
// https://www.youtube.com/watch?v=V6H1qAeB-l4&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=32
// https://www.youtube.com/watch?v=PATgNiuTP20&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=33
// https://www.youtube.com/watch?v=3dINsjyfooY&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=34
public class DijkstrasAlgorithm {

    public static ArrayList<Integer> solve(ArrayList<ArrayList<iPair>> adj, int src) {
        int n = adj.size();
        // Initialization
        Integer[] dist = new Integer[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        int[] path = new int[n];
        Arrays.fill(path, -1);
//        path[src] = 0;
        PriorityQueue<iPair> frontiers = new PriorityQueue<>(new iPairComparator());
        frontiers.add(new iPair(src, 0));
        while (!frontiers.isEmpty()) {
            iPair u = frontiers.poll();
            for (iPair v : adj.get(u.first)) {
                if (dist[u.first] + v.second < dist[v.first]) {
                    dist[v.first] = dist[u.first] + v.second; // Relax
                    frontiers.add(new iPair(v.first, dist[v.first]));
                    path[v.first] = u.first; // Track a previous vertex.
                }
            }
        }
        return new ArrayList<Integer>(Arrays.asList(dist));
    }
}
