package com.fujarkojar.app.graph;

import java.util.*;

// Number of Distinct Islands
// https://www.geeksforgeeks.org/problems/number-of-distinct-islands/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-distinct-islands
// https://takeuforward.org/data-structure/number-of-distinct-islands/
// https://www.youtube.com/watch?v=7zmgQSJghpo
public class NumberOfDistinctIslands {

    public static int solve(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        for (int[] row : visited) {
            Arrays.fill(row, 0);
        }

        HashSet<ArrayList<ArrayList<Integer>>> counter = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    ArrayList<ArrayList<Integer>> path = new ArrayList<>();
                    helper(grid, n, m, i, j, visited, path);
                    ArrayList<Integer> first = path.get(0);
                    for (int k = 0; k < path.size(); ++k) {
                        ArrayList<Integer> normalized = new ArrayList<>();
                        normalized.add(path.get(k).get(0) - first.get(0));
                        normalized.add(path.get(k).get(1) - first.get(1));
                        path.set(k, normalized);
                    }
                    counter.add(path);
                }
            }
        }

        return counter.size();
    }

    private static void helper(int[][] grid, int n, int m, int i, int j, int[][] visited, ArrayList<ArrayList<Integer>> path) {
        ArrayList<Integer> node = new ArrayList<>(Arrays.asList(new Integer[]{i, j}));
        path.add(node);
        visited[i][j] = 1; // Now grid[i][j] is visited.
        if (i - 1 >= 0 && grid[i - 1][j] == 1 && visited[i - 1][j] == 0) { // Not visited
            helper(grid, n, m, i - 1, j, visited, path);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1 && visited[i][j - 1] == 0) {
            helper(grid, n, m, i, j - 1, visited, path);
        }
        if (i + 1 <= n - 1 && grid[i + 1][j] == 1 && visited[i + 1][j] == 0) {
            helper(grid, n, m, i + 1, j, visited, path);
        }
        if (j + 1 <= m - 1 && grid[i][j + 1] == 1 && visited[i][j + 1] == 0) {
            helper(grid, n, m, i, j + 1, visited, path);
        }
    }
}
