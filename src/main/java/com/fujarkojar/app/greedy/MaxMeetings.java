package com.fujarkojar.app.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

// N meetings in one room
// https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
// https://takeuforward.org/data-structure/n-meetings-in-one-room/
// https://www.youtube.com/watch?v=II6ziNnub1Q&t=34s
public class MaxMeetings implements Comparator<Integer[]> {

    @Override
    public int compare(Integer[] o1, Integer[] o2) {
        if (Objects.equals(o1[1], o2[1])) {
            return o1[2] - o2[2];
        } else {
            return o1[1] - o2[1];
        }
    }

    public static int solveByGreedy(int[] start, int[] end) {
        if (start.length != end.length) {
            return -1;
        }
        int n = start.length;
        Integer[][] meetings = new Integer[n][];
        for (int i = 0; i < n; ++i) {
            meetings[i] = new Integer[]{start[i], end[i], i};
        }
        // Sort the meeting by the ending time.
        Arrays.sort(meetings, new MaxMeetings());

        int count = 0;
        int endTime = -1;
        for (int i = 0; i < n; ++i) {
            if (meetings[i][0] > endTime) {
                if (meetings[i][1] > endTime) {
                    endTime = meetings[i][1];
                }
                // The meeting is counted.
                count++;
            }
        }
        return count;
    }

    public static int solveByMemoization(int[] start, int[] end) {
        // Add an extra items.
        int[] startEx = new int[start.length + 2];
        int[] endEx = new int[end.length + 2];
        int n = startEx.length;
        startEx[0] = endEx[0] = -1;
        startEx[n - 1] = endEx[n - 1] = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; ++i) {
            startEx[i] = start[i - 1];
            endEx[i] = end[i - 1];
        }
        int[][] dp = new int[n][n];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return helperByMemoization(startEx, endEx, 0, n - 1, dp);
    }

    private static int helperByMemoization(int[] start, int[] end, int i, int j, int[][] dp) {
        // Base case
        if (i >= j) {
            return 0;
        }
        int n = start.length;
        // Memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int maxCount = 0;
        for (int k = 1; k < n - 1; ++k) {
            if (start[k] > end[i] && end[k] < start[j]) {
                maxCount = Math.max(
                        maxCount,
                        helperByMemoization(start, end, i, k, dp) // first half
                                + helperByMemoization(start, end, k, j, dp) // second half
                                + 1);
            }
        }
        dp[i][j] = maxCount;
        return maxCount;
    }
}
