package com.fujarkojar.app.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {

    public static void solve(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        Arrays.fill(row, 1);
        int[] col = new int[m];
        Arrays.fill(col, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                row[i] *= matrix[i][j] == 0 ? 0 : 1;
                col[j] *= matrix[i][j] == 0 ? 0 : 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (row[i] == 0 || col[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n];
        Arrays.fill(row, 1);
        int[] col = new int[m];
        Arrays.fill(col, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                row[i] *= matrix.get(i).get(j) == 0 ? 0 : 1;
                col[j] *= matrix.get(i).get(j) == 0 ? 0 : 1;
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            ArrayList<Integer> ansRow = new ArrayList<>();
            for (int j = 0; j < m; ++j) {
                if (row[i] == 0 || col[j] == 0) {
                    ansRow.add(0);
                } else {
                    ansRow.add(matrix.get(i).get(j));
                }
            }
            ans.add(ansRow);
        }

        return ans;
    }
}
