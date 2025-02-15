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

    public static int solve(int[] start, int[] end) {
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
}
