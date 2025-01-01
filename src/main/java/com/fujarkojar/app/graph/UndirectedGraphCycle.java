package com.fujarkojar.app.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=detect-cycle-in-an-undirected-graph
// https://www.youtube.com/watch?v=BPlrALf1LDU
public class UndirectedGraphCycle {

    private static class Pair {
        public int index;
        public int prev;

        public Pair(int _index, int _prev) {
            this.index = _index;
            this.prev = _prev;
        }
    }

    public static boolean solveByBSF(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<String> color = new ArrayList<>();
        for (int i = 0; i < adj.size(); ++i) {
            color.add("white");
        }

        Queue<Pair> frontiers = new LinkedList<>();

        for (int i = 0; i < adj.size(); ++i) {
            if (color.get(i).equals("white")) {
                frontiers.add(new Pair(i, -1));
                color.set(i, "gray");
            }

            while (!frontiers.isEmpty()) {
                Pair node = frontiers.poll();
                // Get neighboring nodes.
                ArrayList<Integer> neighbors = adj.get(node.index);
                color.set(node.index, "black");
                for (int j : neighbors) {
                    // Add the neighboring nodes to the queue if they are not visited yet.
                    if (color.get(j).equals("white")) {
                        frontiers.add(new Pair(j, node.index));
                        color.set(j, "gray");
                    } else if (j != node.prev) {
                        // The current node happens to be next to any node which is already visited but not its parent.
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean solveByDFS(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<String> color = new ArrayList<>();
        for (int i = 0; i < adj.size(); ++i) {
            color.add("white");
        }

        Stack<Pair> frontiers = new Stack<>();

        for (int i = 0; i < adj.size(); ++i) {
            if (color.get(i).equals("white")) {
                frontiers.push(new Pair(i, -1));
                color.set(i, "gray");
            }

            while (!frontiers.isEmpty()) {
                Pair node = frontiers.pop();
                // Get neighboring nodes.
                ArrayList<Integer> neighbors = adj.get(node.index);
                color.set(node.index, "black");
                for (int j : neighbors) {
                    // Add the neighboring nodes to the queue if they are not visited yet.
                    if (color.get(j).equals("white")) {
                        frontiers.push(new Pair(j, node.index));
                        color.set(j, "gray");
                    } else if (j != node.prev) {
                        // The current node happens to be next to any node which is already visited but not its parent.
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
