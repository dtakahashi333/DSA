package com.fujarkojar.app.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

// All Root to Leaf Paths In Binary Tree.
// https://www.naukri.com/code360/problems/all-root-to-leaf-paths-in-binary-tree._983599?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class RootToLeafPaths {

    public static List<String> solve(BinaryTreeNode root) {
        Stack<Integer> path = new Stack<>();
        List<String> output = new ArrayList<>();
        helper(root, path, output);
        return output;
    }

    private static void helper(BinaryTreeNode node, Stack<Integer> path, List<String> output) {
        path.push(node.data);
        // If the node is a leaf.
        if (node.left == null && node.right == null) {
            output.add(
                    path.stream().map(Object::toString).collect(Collectors.joining(" "))
            );
        }
        // Take left.
        if (node.left != null) {
            helper(node.left, path, output);
        }
        // Take right.
        if (node.right != null) {
            helper(node.right, path, output);
        }
        // Pop the node before going back to the parent.
        path.pop();
    }
}
