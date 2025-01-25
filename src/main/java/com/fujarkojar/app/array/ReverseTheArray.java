package com.fujarkojar.app.array;

import java.util.List;

// Reverse The Array
// https://www.naukri.com/code360/problems/reverse-the-array_1262298
public class ReverseTheArray {

    public static void solve(List<Integer> arr, int m) {
        for (int i = m + 1, j = arr.size() - 1; i < j; ++i, --j) {
            // Swap values.
            int tmp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, tmp);
        }
    }
}
