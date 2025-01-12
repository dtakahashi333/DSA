package com.fujarkojar.app.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 118. Pascal's Triangle
// https://leetcode.com/problems/roman-to-integer/description/
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
}
