package com.fujarkojar.app.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static BinaryTreeNode build(int[] nodes) {
        int n = nodes.length;
        BinaryTreeNode root = null;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int i = 0;
        while (i < n) {
            if (root == null && nodes[i] != -1) {
                root = new BinaryTreeNode(nodes[i]);
                queue.add(root);
            } else {
                BinaryTreeNode node = queue.poll();
                if (node == null) {
                    break;
                }
                if (nodes[i] != -1) {
                    BinaryTreeNode childNode = new BinaryTreeNode(nodes[i]);
                    node.left = childNode;
                    queue.add(childNode);
                }
                i++;
                if (i < n && nodes[i] != -1) {
                    BinaryTreeNode childNode = new BinaryTreeNode(nodes[i]);
                    node.right = childNode;
                    queue.add(childNode);
                }
            }
            i++;
        }
        return root;
    }
}
