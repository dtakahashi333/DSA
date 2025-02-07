package com.fujarkojar.app.array;

// Maximum Subarray Sum
// https://www.naukri.com/code360/problems/630526?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=SUBMISSION
// https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
// https://www.youtube.com/watch?v=AHZpyENo7k4&t=1209s
public class MaxSubarraySum {

    // Use Kadane's algorithm.
    public static long solveByKadanesAlgorithm(int[] arr, int n) {
        long left = 0;
        long right = 0;
        long maxSum = 0;
        for (int i = 0; i < n; ++i) {
            // Go from left.
            if (arr[i] < 0 && left + arr[i] < 0) {
                left = 0;
            } else {
                left += arr[i];
            }
            // Go from right.
            if (arr[n - 1 - i] < 0 && right + arr[n - 1 - i] < 0) {
                right = 0;
            } else {
                right += arr[n - 1 - i];
            }
            // Calculate the maximum.
            maxSum = Math.max(maxSum, Math.max(left, right));
        }
        return maxSum;
    }
}
