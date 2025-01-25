package com.fujarkojar.app.graph;

import java.util.Arrays;

// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/description/
// https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find_the_number_of_islands
// https://www.youtube.com/watch?v=muncqlKJrH0&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=8
public class NumberOfIslands {

    public static int solve(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        for (int[] row : visited) {
            Arrays.fill(row, 0);
        }

        int count = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    helper(grid, n, m, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void helper(char[][] grid, int n, int m, int i, int j, int[][] visited) {
        visited[i][j] = 1; // Now grid[i][j] is visited.
        if (i - 1 >= 0 && grid[i - 1][j] == '1' && visited[i - 1][j] == 0) { // Not visited
            helper(grid, n, m, i - 1, j, visited);
        }
        if (j - 1 >= 0 && grid[i][j - 1] == '1' && visited[i][j - 1] == 0) {
            helper(grid, n, m, i, j - 1, visited);
        }
        if (i + 1 <= n - 1 && grid[i + 1][j] == '1' && visited[i + 1][j] == 0) {
            helper(grid, n, m, i + 1, j, visited);
        }
        if (j + 1 <= m - 1 && grid[i][j + 1] == '1' && visited[i][j + 1] == 0) {
            helper(grid, n, m, i, j + 1, visited);
        }
    }
}
