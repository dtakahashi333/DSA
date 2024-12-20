package com.fujarkojar.app;

import java.util.List;

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
