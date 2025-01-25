package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Topological sort
// https://www.geeksforgeeks.org/problems/topological-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=topological-sort
// https://takeuforward.org/data-structure/kahns-algorithm-topological-sort-algorithm-bfs-g-22/
// https://www.youtube.com/watch?v=73sneFXuTEg&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=14
public class KahnsAlgorithm {

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> adj) {
        // Initialize
        int N = adj.size();
        int[] indegrees = new int[N];
        Arrays.fill(indegrees, 0);

        for (int i = 0; i < adj.size(); ++i) {
            for (int j = 0; j < adj.get(i).size(); ++j) {
                indegrees[adj.get(i).get(j)]++;
            }
        }

        Queue<Integer> frontiers = new LinkedList<>();
        for (int i = 0; i < indegrees.length; ++i) {
            if (indegrees[i] == 0) {
                frontiers.add(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!frontiers.isEmpty()) {
            int i = frontiers.poll();
            result.add(i);
            for (int j = 0; j < adj.get(i).size(); ++j) {
                int ind = adj.get(i).get(j);
                indegrees[ind]--;
                // If the indegree of it becomes zero, put the node into the frontiers.
                if (indegrees[ind] == 0) {
                    frontiers.add(ind);
                }
            }
        }

        return result;
    }
}
