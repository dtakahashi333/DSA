package com.fujarkojar.app.greedy;

import java.util.*;

// Job Sequencing Problem
// https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
// https://takeuforward.org/data-structure/job-sequencing-problem/
// https://www.youtube.com/watch?v=LjPx4wQaRIs
public class JobSequencing implements Comparator<Integer[]> {

    public static ArrayList<Integer> solve(int[] id, int[] deadline, int[] profit) {
        // Check if all the arrays have the same size.
        if (id.length != deadline.length || id.length != profit.length) {
            return null;
        }
        int n = id.length;
        if (n == 0) { // Empty jobs.
            return new ArrayList<>(Arrays.asList(new Integer[]{0, 0}));
        }
        Integer[][] jobs = new Integer[n][3];
        for (int i = 0; i < n; ++i) {
            jobs[i][0] = id[i];
            jobs[i][1] = deadline[i];
            jobs[i][2] = profit[i];
        }
        // Sort the jobs in the reverse deadline order.
        Arrays.sort(jobs, new JobSequencing());

        // Get the maximum day.
        Arrays.sort(deadline);
        Integer[] days = new Integer[deadline[n - 1]];
        Arrays.fill(days, null);

        int maxJobs = 0;
        int maxProfit = 0;
        for (int i = 0; i < n; ++i) {
            int j = jobs[i][1] - 1;
            while (j >= 0 && days[j] != null) {
                j--;
            }
            if (j >= 0) {
                days[j] = jobs[i][0]; // mark the spot with the job ID.
                maxJobs++;
                maxProfit += jobs[i][2];
            }
        }
        return new ArrayList<>(Arrays.asList(new Integer[]{maxJobs, maxProfit}));
    }

    @Override
    public int compare(Integer[] o1, Integer[] o2) {
        // Priority: profit > deadline
        if (Objects.equals(o1[2], o2[2])) {
            return o2[1] - o1[1]; // descending order in terms of deadline.
        }
        return o2[2] - o1[2]; // descending order in terms of profit.
    }
}
