package com.fujarkojar.app.graph;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

// Kruskal (MST): Really Special Subtree
// https://www.hackerrank.com/challenges/kruskalmstrsub/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class Kruskals {

    /**
     * @param gNodes  An integer that represents the number of nodes in the tree
     * @param gFrom   An array of integers that represent beginning edge node numbers
     * @param gTo     An array of integers that represent ending edge node numbers
     * @param gWeight An array of integers that represent the weights of each edge
     * @return A single integer denoting the total weight of the Really Special SubTree
     */
    public static int solve(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        List<int[]> graph = new ArrayList<>();
        for (int i = 0; i < gFrom.size(); i++) {
            graph.add(new int[]{gFrom.get(i), gTo.get(i), gWeight.get(i)});
        }
        graph.sort(Comparator.comparingInt(a -> a[2]));
        // System.out.println("u\tv\twt");
        // for (int[] node : graph) {
        //     System.out.println(node[0] + "\t" + node[1] + "\t" + node[2]);
        // }

        DisjointSet set = new DisjointSet(gNodes);

        // List<int[]> subtree = new ArrayList<>();
        int sum = 0;
        for (int[] node : graph) {
            int nodeFrom = node[0];
            int nodeTo = node[1];
            int weight = node[2];
            if (set.findUltimateParent(nodeFrom) == set.findUltimateParent(nodeTo)) {
                // It's already in the subtree.
                continue;
            }
            sum += weight;
            // subtree.add(new int[]{nodeFrom, nodeTo, weight});
            set.unionByRank(nodeFrom, nodeTo);
        }
        // System.out.println("u\tv\twt");
        // for (int[] node : subtree) {
        //     System.out.println(node[0] + "\t" + node[1] + "\t" + node[2]);
        // }
        return sum;
    }
}
