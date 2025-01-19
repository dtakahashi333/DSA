package com.fujarkojar.app.binarytree;

import java.util.*;

// 662. Maximum Width of Binary Tree
// https://leetcode.com/problems/maximum-width-of-binary-tree/submissions/1513114356/
// Maximum Width In Binary Tree
// https://www.naukri.com/code360/problems/maximum-width-in-binary-tree_763671?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class MaximumWidth {

    // Solution for LeetCode
    public static int solve1(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        // Track horizontal and vertical indices for each node.
        Hashtable<BinaryTreeNode, List<Long>> indices = new Hashtable<>();

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        indices.put(root, Arrays.asList(new Long[]{0L, 1L}));

        int maxDepth = 0;
        while (!queue.isEmpty()) {
            BinaryTreeNode parent = queue.poll();
            List<Long> parentIndices = indices.get(parent);
            if (parent.left != null) {
                queue.add(parent.left);
                indices.put(parent.left, Arrays.asList(new Long[]{parentIndices.get(0) + 1, parentIndices.get(1) * 2 - 1}));
            }
            if (parent.right != null) {
                queue.add(parent.right);
                indices.put(parent.right, Arrays.asList(new Long[]{parentIndices.get(0) + 1, parentIndices.get(1) * 2}));
            }
            // Track the depth of the tree.
            if (parentIndices.get(0) > maxDepth) {
                maxDepth = Math.toIntExact(parentIndices.get(0));
            }
        }

        long[][] widths = new long[maxDepth + 1][2];
        for (long[] arr : widths) {
            arr[0] = Long.MAX_VALUE;
            arr[1] = Long.MIN_VALUE;
        }
        for (BinaryTreeNode key : indices.keySet()) {
            List<Long> cur = indices.get(key);
            int depth = Math.toIntExact(cur.get(0));
            if (cur.get(1) < widths[depth][0]) {
                widths[depth][0] = cur.get(1);
            }
            if (cur.get(1) > widths[depth][1]) {
                widths[depth][1] = cur.get(1);
            }
        }

        long maxWidth = 0;
        for (long[] depth : widths) {
            long width = depth[1] - depth[0] + 1;
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return (int) maxWidth;
    }

    // Solution for code360
    public static int solve2(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        // Track horizontal and vertical indices for each node.
        Hashtable<BinaryTreeNode, List<Integer>> indices = new Hashtable<>();

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        indices.put(root, Arrays.asList(new Integer[]{0, 1}));

        int maxDepth = 0;
        while (!queue.isEmpty()) {
            BinaryTreeNode parent = queue.poll();
            List<Integer> parentIndices = indices.get(parent);
            if (parent.left != null) {
                queue.add(parent.left);
                indices.put(parent.left, Arrays.asList(new Integer[]{parentIndices.get(0) + 1, parentIndices.get(1) * 2 - 1}));
            }
            if (parent.right != null) {
                queue.add(parent.right);
                indices.put(parent.right, Arrays.asList(new Integer[]{parentIndices.get(0) + 1, parentIndices.get(1) * 2}));
            }
            // Track the depth of the tree.
            if (parentIndices.get(0) > maxDepth) {
                maxDepth = parentIndices.get(0);
            }
        }

        Integer[] widths = new Integer[maxDepth + 1];
        Arrays.fill(widths, 0);
        for (BinaryTreeNode key : indices.keySet()) {
            List<Integer> index = indices.get(key);
            widths[index.get(0)]++;
        }

        return Collections.max(Arrays.asList(widths));
    }
}
