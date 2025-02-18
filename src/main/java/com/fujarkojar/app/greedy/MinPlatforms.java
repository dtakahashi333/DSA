package com.fujarkojar.app.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

// Minimum Platforms
// https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
// https://takeuforward.org/data-structure/minimum-number-of-platforms-required-for-a-railway/
// https://www.youtube.com/watch?v=dxVcMDI7vyI
public class MinPlatforms implements Comparator<Integer[]> {

    @Override
    public int compare(Integer[] o1, Integer[] o2) {
        if (Objects.equals(o1[0], o2[0])) {
            return o1[1] - o2[1];
        }
        return o1[0] - o2[0];
    }

    public static int solveByBruteForce(int[] arr, int[] dep) {
        int n = arr.length;
        int maxCount = 0;
        for (int i = 0; i < n; ++i) {
            int count = 1;
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] <= arr[j] && arr[j] <= dep[i] ||
                        arr[i] <= dep[j] && dep[j] <= dep[i] ||
                        arr[j] <= arr[i] && arr[i] <= dep[j] ||
                        arr[j] <= dep[i] && dep[i] <= dep[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static int solveByGreedy(int[] arr, int[] dep) {
        if (arr.length != dep.length) {
            return -1;
        }
        int n = arr.length;
        Integer[][] timeTable = new Integer[2 * n][2];
        for (int i = 0; i < n; ++i) {
            timeTable[2 * i][0] = arr[i];
            timeTable[2 * i][1] = 1;
            timeTable[2 * i + 1][0] = dep[i];
            timeTable[2 * i + 1][1] = 2;
        }
        Arrays.sort(timeTable, new MinPlatforms());
        int maxCount = 0, count = 0;
        for (int i = 0; i < 2 * n; ++i) {
            if (timeTable[i][1] == 1) { // Arrival
                count++;
            } else if (timeTable[i][1] == 2) { // Departure
                count--;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
