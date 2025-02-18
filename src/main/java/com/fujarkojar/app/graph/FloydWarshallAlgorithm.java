package com.fujarkojar.app.graph;

// Floyd Warshall
// https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1
// https://takeuforward.org/data-structure/floyd-warshall-algorithm-g-42/
// https://www.youtube.com/watch?v=YbY8cVwWAvw
public class FloydWarshallAlgorithm {

    public static void solve(int[][] mat) {
        int n = mat.length;
        // Replace -1 to Integer.MAX_VALUE for not reachable.
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mat[i][j] == -1) {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for (int k = 0; k < n; ++k) { // A layover
            for (int i = 0; i < n; ++i) { // A source
                for (int j = 0; j < n; ++j) { // A destination
                    // If the nodes are reachable.
                    if (mat[i][k] != Integer.MAX_VALUE && mat[k][j] != Integer.MAX_VALUE) {
                        int dist = mat[i][k] + mat[k][j];
                        if (dist < mat[i][j]) {
                            mat[i][j] = dist;
                        }
                    }
                }
            }
        }

        // Replace Integer.MAX_VALUE to -1 for not reachable.
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mat[i][j] == Integer.MAX_VALUE) {
                    mat[i][j] = -1;
                }
            }
        }
    }
}
