package com.fujarkojar.app.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWidthTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1_1() {
        BinaryTreeNode root = BinaryTree.build(new int[]{1, 3, 2, 5, 3, -1, 9});
        int expected = 4;
        assertEquals(expected, MaximumWidth.solve1(root));
    }

    @Test
    void solve1_2() {
        BinaryTreeNode root = BinaryTree.build(new int[]{1, 3, 2, 5, -1, -1, 9, 6, -1, 7});
        int expected = 7;
        assertEquals(expected, MaximumWidth.solve1(root));
    }

    @Test
    void solve1_3() {
        BinaryTreeNode root = BinaryTree.build(new int[]{1, 3, 2, 5});
        int expected = 2;
        assertEquals(expected, MaximumWidth.solve1(root));
    }

    @Test
    void solve1_4() {
        BinaryTreeNode root = BinaryTree.build(new int[]{1, 1, 1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, -1, 1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1
        });
        int expected = 2147483645;
        assertEquals(expected, MaximumWidth.solve1(root));
    }

    @Test
    void solve2_1() {
        BinaryTreeNode root = BinaryTree.build(new int[]{1, 2, 3, 4, -1, 5, 6, -1, 7, -1, -1, -1, -1, -1, -1});
        int expected = 3;
        assertEquals(expected, MaximumWidth.solve2(root));
    }

    @Test
    void solve2_2() {
        BinaryTreeNode root = BinaryTree.build(new int[]{2, 7, 5, 2, 6, -1, 9, -1, -1, 5, 11, 4, -1, -1, -1, -1, -1, -1, -1});
        int expected = 3;
        assertEquals(expected, MaximumWidth.solve2(root));
    }

    @Test
    void solve2_3() {
        BinaryTreeNode root = BinaryTree.build(new int[]{-1});
        int expected = 0;
        assertEquals(expected, MaximumWidth.solve2(root));
    }

    @Test
    void solve2_4() {
        BinaryTreeNode root = BinaryTree.build(new int[]{1, -1, 2, -1, 3, -1, 4, -1, 5, -1, 6, -1, 7, -1, 8, -1, 9, -1, 10, -1, -1});
        int expected = 1;
        assertEquals(expected, MaximumWidth.solve2(root));
    }

    @Test
    void solve2_5() {
        BinaryTreeNode root = BinaryTree.build(new int[]{81, 9, 82, -1, 7, 8, -1, 5, 6, 3, 2, -1, -1, -1, -1, -1, -1, -1, -1});
        int expected = 4;
        assertEquals(expected, MaximumWidth.solve2(root));
    }

    @Test
    void solve2_6() {
        BinaryTreeNode root = BinaryTree.build(new int[]{94, 47, 31, 53, 38, 50, 52, 97, 28, 16, 26, 67, 37, 82, 5, 1, 4, 60, 39, 77, 33, -1, -1, 88, 56, 87, 10, 74, 14, 48, -1, 72, -1, 57, -1, 11, 92, 84, 41, -1, -1, -1, -1, 91, 25, -1, -1, 7, 79, 66, 59, 68, -1, 27, 100, 80, 90, 23, 70, 17, -1, 40, 32, 18, -1, 95, 86, 99, 30, 51, 71, 19, -1, 21, -1, 36, 55, 96, 75, 89, 64, -1, -1, 24, 46, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, 73, 85, 20, 45, 2, 69, 44, -1, 78, 65, -1, -1, -1, -1, 6, 22, -1, -1, 61, 58, -1, -1, 76, -1, -1, -1, 62, 9, 12, -1, 3, -1, 54, 42, 29, -1, -1, -1, -1, -1, -1, -1, 8, -1, -1, -1, 83, 49, -1, -1, 43, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, 98, 93, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1});
        int expected = 23;
        assertEquals(expected, MaximumWidth.solve2(root));
    }
}