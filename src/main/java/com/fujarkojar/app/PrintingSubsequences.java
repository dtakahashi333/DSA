package com.fujarkojar.app;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequences {

    public static void solve(int[] arr) {
        List<Integer> lst = new ArrayList<>();
        helper(arr, 0, lst);
    }

    public static void helper(int[] arr, int i, List<Integer> lst) {
        if (i >= arr.length) { // Base case
            // Print the sub-array.
            System.out.println(lst.toString());
            return;
        }
        lst.add(arr[i]); // Taken
        helper(arr, i + 1, lst);
        lst.remove(Integer.valueOf(arr[i])); // Not taken
        helper(arr, i + 1, lst);
    }
}
