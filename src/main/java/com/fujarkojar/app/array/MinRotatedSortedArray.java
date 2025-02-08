package com.fujarkojar.app.array;

// Find Minimum in Rotated Sorted Array
// https://www.naukri.com/code360/problems/rotated-array_1093219?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
// https://takeuforward.org/data-structure/minimum-in-rotated-sorted-array/
// https://www.youtube.com/watch?v=nhEMDKMB44g
public class MinRotatedSortedArray {

    public static int solve(int[] arr) {
        int n = arr.length;
        return helper(arr, 0, n - 1, arr[n - 1]);
    }

    private static int helper(int[] arr, int i, int j, int min) {
        if (i >= j) {
            return min;
        }
        int m = (i + j) / 2;
        if (arr[m] > min) {
            return helper(arr, m + 1, j, min);
        } else {
            return helper(arr, i, m, arr[m]);
        }
    }
}
