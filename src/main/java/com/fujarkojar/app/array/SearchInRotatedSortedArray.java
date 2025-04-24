package com.fujarkojar.app.array;

import java.util.ArrayList;

// Search In Rotated Sorted Array
// https://www.naukri.com/code360/problems/search-in-rotated-sorted-array_1082554?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
// https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/
// https://www.youtube.com/watch?v=5qGrJbHhqFs
public class SearchInRotatedSortedArray {

    public static int solve(ArrayList<Integer> arr, int n, int k) {
        return helper(arr, n, k, 0, n - 1);
    }

    private static int helper(ArrayList<Integer> arr, int n, int k, int i, int j) {
        if (i > j) {
            return -1;
        }

        int m = (i + j) / 2; // mid-point

        if (k == arr.get(m)) { // found.
            return m;
        }

        if (k < arr.get(m)) {
            if (arr.get(i) < arr.get(m)) {
                if (arr.get(i) <= k) {
                    return helper(arr, n, k, i, m - 1);
                } else {
                    return helper(arr, n, k, m + 1, j);
                }
            } else {
                return helper(arr, n, k, i, m - 1);
            }
        } else { // if (k > arr.get(m))
            if (arr.get(m) < arr.get(j)) {
                if (k <= arr.get(j)) {
                    return helper(arr, n, k, m + 1, j);
                } else {
                    return helper(arr, n, k, i, m - 1);
                }
            } else {
                return helper(arr, n, k, m + 1, j);
            }
        }
    }
}
