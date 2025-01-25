package com.fujarkojar.app.array;

// Subarray With Maximum Product
// https://www.naukri.com/code360/problems/subarray-with-maximum-product_6890008?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
// https://takeuforward.org/data-structure/maximum-product-subarray-in-an-array/
// https://www.youtube.com/watch?v=hnswaLJvr6g
public class SubarrayWithMaxProduct {

    public static int solveByBruteForce(int[] arr) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            int lastProduct = 1;
            for (int j = i; j < arr.length; ++j) {
                int curProduct = arr[j] * lastProduct;
                if (curProduct > maxProduct) {
                    maxProduct = curProduct;
                }
                lastProduct = curProduct;
            }
        }
        return maxProduct;
    }

    public static int solveByOptimal(int[] arr) {
        // Case 1: All positives.
        // Case 2: Even number of negatives.
        // Case 3: Odd number of negatives.
        // Case 4: Existence of zeros.
        int pref = 1;
        int suff = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            if (pref == 0) {
                pref = 1;
            }
            if (suff == 0) {
                suff = 1;
            }
            pref *= arr[i];
            suff *= arr[arr.length - 1 - i];
            max = Math.max(max, Math.max(pref, suff));
        }
        return max;
    }
}
