package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

// https://www.geeksforgeeks.org/problems/topological-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=topological-sort
// https://www.youtube.com/watch?v=5lZ0iJMrUMk&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=13
public class TopologicalSort {

    public static ArrayList<Integer> solveByRecursion(ArrayList<ArrayList<Integer>> adj) {
        int N = adj.size();
        int[] visited = new int[N];
        Arrays.fill(visited, 0);
        Stack<Integer> sorted = new Stack<>();
        for (int i = 0; i < adj.size(); ++i) {
            helperByRecursion(adj, i, visited, sorted);
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (!sorted.isEmpty()) {
            result.add(sorted.pop());
        }
        return result;
    }

    private static void helperByRecursion(ArrayList<ArrayList<Integer>> adj, int ind, int[] visited, Stack<Integer> sorted) {
        if (visited[ind] != 0) {
            // The node is already visited.
            return;
        }
        // Mark the node as visited.
        visited[ind] = 1;

        for (int j : adj.get(ind)) {
            helperByRecursion(adj, j, visited, sorted);
        }

        // Add the current node to the sorted stack.
        sorted.push(ind);
    }
}
