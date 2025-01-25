package com.fujarkojar.app.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 118. Pascal's Triangle
// https://leetcode.com/problems/roman-to-integer/description/
// https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/
// https://www.youtube.com/watch?v=bR7mQgwQ_o8&t=6s
public class PascalsTriangle {

    public static List<List<Integer>> solve(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        tri.add(Arrays.asList(new Integer[]{1}));
        for (int i = 2; i <= numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; ++j) {
                if (j == 0) {
                    row.add(tri.get(i - 2).get(j));
                } else if (j == i - 1) {
                    row.add(tri.get(i - 2).get(j - 1));
                } else {
                    row.add(tri.get(i - 2).get(j - 1) + tri.get(i - 2).get(j));
                }
            }
            tri.add(row);
        }
        return tri;
    }

    public static List<List<Integer>> solveByRecursion(int numRows) {
        if (numRows == 1) {
            List<List<Integer>> baseRow = new ArrayList<>();
            baseRow.add(Arrays.asList(new Integer[]{1}));
            return baseRow;
        }
        List<List<Integer>> tri = solveByRecursion(numRows - 1);
        List<Integer> prevRow = tri.get(tri.size() - 1);
        List<Integer> curRow = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            if (i == 0) {
                curRow.add(prevRow.get(i));
            } else if (i == numRows - 1) {
                curRow.add(prevRow.get(i - 1));
            } else {
                curRow.add(prevRow.get(i - 1) + prevRow.get(i));
            }
        }
        tri.add(curRow);
        return tri;
    }

    // Use a combination formula.
    public static List<List<Integer>> solve2(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                row.add(comb(i, j));
            }
            tri.add(row);
        }
        return tri;
    }

    private static int comb(int n, int k) {
        int numer = 1;
        int denom = 1;
        for (int i = 0; i < k; ++i) {
            numer *= (n - i);
            denom *= (k - i);
        }
        return numer / denom;
    }

    public static List<List<Integer>> solve3(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int prev = 1;
            for (int j = 0; j < i; ++j) {
                int cur = prev * (i - j) / (j + 1);
                row.add(cur);
                prev = cur;
            }
            tri.add(row);
        }
        return tri;
    }
}
