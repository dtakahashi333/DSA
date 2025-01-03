package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.Stack;

// https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=detect-cycle-in-a-directed-graph
// https://www.youtube.com/watch?v=9twcmtQj4DU&t=1s
public class DirectedGraphCycle {

    // 1. Cannot use the same algorithm as the one for Undirected.
    // 2. Don't have to track the previous node because unless it is specified (directed) it doesn't go back to the previous node.
    // 3. Need to evaluate routes from all sources. Reset the color for each source.
    // 4. Distinguish nodes between visited and ones in the queue, "gray" and "black".
    // 5. Only the routes from the source to the source can be a cycle.

    // The version 1 is a little slower because it iterates all the nodes as a source.
    public static boolean solveByDFS_1(int V, ArrayList<ArrayList<Integer>> adj) {

        Stack<Integer> frontiers = new Stack<>();

        for (int i = 0; i < V; ++i) {
            // Reset color.
            ArrayList<String> color = new ArrayList<>();
            for (int k = 0; k < V; ++k) {
                color.add("white");
            }

            // i becomes source.
            frontiers.push(i);
            color.set(i, "gray");

            while (!frontiers.isEmpty()) {
                int ind = frontiers.pop();
                // Get neighboring nodes.
                ArrayList<Integer> neighbors = adj.get(ind);
                color.set(ind, "black");
                for (int j : neighbors) {
                    // Add the neighboring nodes to the queue if they are not visited yet.
                    if (color.get(j).equals("white")) {
                        frontiers.push(j);
                        color.set(j, "gray");
                    } else if (color.get(j).equals("black") && j == i) {
                        // The current node happens to be next to any node which is already visited but not its parent.
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean solveByDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<String> color = new ArrayList<>();
        ArrayList<String> pathColor = new ArrayList<>();
        for (int i = 0; i < V; ++i) {
            color.add("white");
            pathColor.add("white");
        }

        Stack<Integer> frontiers = new Stack<>();

        for (int i = 0; i < V; ++i) {
            // i becomes source.
            if (color.get(i).equals("white")) {
                frontiers.push(i);
                color.set(i, "gray");
                pathColor.set(i, "gray");
            }

            while (!frontiers.isEmpty()) {
                int ind = frontiers.lastElement();
                color.set(ind, "black");
                pathColor.set(ind, "black");
                // Get neighboring nodes.
                ArrayList<Integer> neighbors = adj.get(ind);
                boolean noNeighbor = true;
                for (int j : neighbors) {
                    // Add the neighboring nodes to the queue if they are not visited yet.
                    if (color.get(j).equals("white")) {
                        frontiers.push(j);
                        color.set(j, "gray");
                        pathColor.set(j, "gray");
                        noNeighbor = false;
                        break;
                    } else if (pathColor.get(j).equals("black")) {
                        // The current node happens to be next to any node which is already visited but not its parent.
                        return true;
                    }
                }
                if (noNeighbor) {
                    frontiers.pop();
                    pathColor.set(ind, "white");
                }
            }
        }

        return false;
    }
}