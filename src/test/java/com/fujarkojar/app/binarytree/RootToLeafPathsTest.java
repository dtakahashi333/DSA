package com.fujarkojar.app.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RootToLeafPathsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        BinaryTreeNode two = new BinaryTreeNode(2);
        two.left = new BinaryTreeNode(4);
        two.right = new BinaryTreeNode(5);
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = two;
        root.right = new BinaryTreeNode(3);
        List<String> expected = new ArrayList<>(Arrays.asList(new String[]{
                "1 2 4", "1 2 5", "1 3"
        }));
        assertIterableEquals(expected, RootToLeafPaths.solve(root));
    }

    @Test
    void solve2() {
        BinaryTreeNode four = new BinaryTreeNode(4);
        four.right = new BinaryTreeNode(7);
        BinaryTreeNode two = new BinaryTreeNode(2);
        two.left = four;
        BinaryTreeNode three = new BinaryTreeNode(3);
        three.left = new BinaryTreeNode(5);
        three.right = new BinaryTreeNode(6);
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = two;
        root.right = three;
        List<String> expected = new ArrayList<>(Arrays.asList(new String[]{
                "1 3 5", "1 3 6", "1 2 4 7"
        }));
        Collections.sort(expected);
        List<String> actual = RootToLeafPaths.solve(root);
        Collections.sort(actual);
        assertIterableEquals(expected, actual);
    }
}