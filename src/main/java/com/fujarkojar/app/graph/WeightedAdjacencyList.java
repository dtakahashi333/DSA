package com.fujarkojar.app.graph;

import java.util.ArrayList;

public class WeightedAdjacencyList {

    public static ArrayList<ArrayList<iPair>> fromArray(int[][][] adj) {
        int n = adj.length;
        ArrayList<ArrayList<iPair>> adjList = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int m = adj[i].length;
            adjList.add(new ArrayList<>());
            for (int j = 0; j < m; ++j) {
                adjList.get(i).add(new iPair(adj[i][j][0], adj[i][j][1]));
            }
        }
        return adjList;
    }

    public static int[][][] toArray(ArrayList<ArrayList<iPair>> adj) {
        int n = adj.size();
        int[][][] adjArr = new int[n][][];
        for (int i = 0; i < n; ++i) {
            int m = adj.get(i).size();
            adjArr[i] = new int[m][];
            for (int j = 0; j < m; ++j) {
                adjArr[i][j] = new int[2];
                adjArr[i][j][0] = adj.get(i).get(j).first;
                adjArr[i][j][1] = adj.get(i).get(j).second;
            }
        }
        return adjArr;
    }
}
