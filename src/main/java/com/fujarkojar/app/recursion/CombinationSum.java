package com.fujarkojar.app.recursion;

import java.util.ArrayList;
import java.util.List;

// 39. Combination Sum
// https://leetcode.com/problems/combination-sum/description/
// https://takeuforward.org/data-structure/combination-sum-1/
// https://www.youtube.com/watch?v=OyZFFqQtu98
public class CombinationSum {

    public static List<List<Integer>> solve(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> output = new ArrayList<>();
        helper(candidates, target, n - 1, new ArrayList<>(), output);
        return output;
    }

    private static void helper(int[] arr, int k, int ind, List<Integer> list, List<List<Integer>> output) {
        if (ind < 0) {
            if (k == 0) {
                output.add(new ArrayList<>(list));
            }
            return;
        }

        // Take
        if (arr[ind] <= k) {
            list.add(arr[ind]);
            helper(arr, k - arr[ind], ind, list, output);
            list.remove(list.size() - 1); // Remove the last element.
        }
        // Not take
        helper(arr, k, ind - 1, list, output);
    }
}
