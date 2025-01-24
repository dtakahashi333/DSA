package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// Strongly Connected
// https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=strongly-connected-components-kosarajus-algo
// https://www.youtube.com/watch?v=R6uoSjZ2imo
public class KosarajusAlgorithm {

    public static int solve(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int[] visited = new int[n];
        Arrays.fill(visited, 0);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; ++i) {
            if (visited[i] == 0) {
                DFS(adj, i, visited, stack);
            }
        }
        // Reverse directions of the graph.
        ArrayList<ArrayList<Integer>> reversed = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            reversed.add(new ArrayList<>());
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < adj.get(i).size(); ++j) {
                reversed.get(adj.get(i).get(j)).add(i);
            }
        }
        // DFS again.
        int count = 0;
        Arrays.fill(visited, 0);
        while (!stack.isEmpty()) {
            int i = stack.pop();
            if (visited[i] == 0) {
                DFS(reversed, i, visited, new Stack<>());
                count++;
            }
        }

        return count;
    }

    private static void DFS(ArrayList<ArrayList<Integer>> adj, int k, int[] visited, Stack<Integer> stack) {
        ArrayList<Integer> vertices = adj.get(k);
        visited[k] = 1;
        for (int i = 0; i < vertices.size(); ++i) {
            int v = vertices.get(i);
            if (visited[v] == 0) {
                DFS(adj, v, visited, stack);
            }
        }
        stack.push(k);
    }
}
