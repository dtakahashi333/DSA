package com.fujarkojar.app.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 785. Is Graph Bipartite?
// https://leetcode.com/problems/is-graph-bipartite/submissions/1514155179/
public class BipartiteGraph {

    public static boolean solveByDFS(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, 0);
        for (int i = 0; i < graph.length; ++i) {
            if (color[i] == 0) {
                color[i] = 1;
                boolean isBipartite = helperByDFS(graph, i, -1, color);
                if (!isBipartite) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean helperByDFS(int[][] graph, int vertex, int prevColor, int[] color) {
        // Color this vertex in either 2 or 3.
        if (prevColor == 2) {
            color[vertex] = 3;
        } else {
            color[vertex] = 2;
        }
        int[] adjacent = graph[vertex];
        for (int i : adjacent) {
            // If the vertex is not either visited or queued yet.
            if (color[i] == 0) {
                color[i] = 1; // Color in 1 meaning that the vertex is queued.
                boolean isBipartite = helperByDFS(graph, i, color[vertex], color);
                if (!isBipartite) {
                    return false;
                }
            } else if (color[vertex] == color[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean solveByBFS(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, 0);
        for (int i = 0; i < graph.length; ++i) {
            if (color[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 2;
                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    int[] adjacent = graph[cur];
                    for (int k : adjacent) {
                        if (color[k] == 0) {
                            queue.add(k);
                            color[k] = (color[cur] == 2) ? 3 : 2;
                        } else if (color[cur] == color[k]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
