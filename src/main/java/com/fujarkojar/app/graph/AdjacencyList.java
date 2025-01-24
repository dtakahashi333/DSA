package com.fujarkojar.app.graph;

import java.util.ArrayList;

public class AdjacencyList {

    public static ArrayList<ArrayList<Integer>> fromArray(int[][] adj) {
        int n = adj.length;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int m = adj[i].length;
            adjList.add(new ArrayList<>());
            for (int j = 0; j < m; ++j) {
                adjList.get(i).add(adj[i][j]);
            }
        }
//        for (int[] ints : adj) {
//            ArrayList<Integer> vertices = new ArrayList<>();
//            for (int anInt : ints) {
//                vertices.add(anInt);
//            }
//            adjList.add(vertices);
//        }
        return adjList;
    }

    public static int[][] toArray(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int[][] adjArr = new int[n][];
        for (int i = 0; i < n; ++i) {
            int m = adj.get(i).size();
            adjArr[i] = new int[m];
            for (int j = 0; j < m; ++j) {
                adjArr[i][j] = adj.get(i).get(j);
            }
        }
        return adjArr;
    }
}
