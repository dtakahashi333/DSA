package com.fujarkojar.app.array;

import java.util.Arrays;

// Missing Number
// https://www.naukri.com/code360/problems/missing-number_6680467?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
// https://takeuforward.org/arrays/find-the-missing-number-in-an-array/
// https://www.youtube.com/watch?v=bYWLJb3vCWY&t=1s
public class MissingNumber {

    public static int solve(int[] a, int N) {
        boolean[] nums = new boolean[N + 1];
        Arrays.fill(nums, false);

        for (int num : a) {
            nums[num] = true;
        }

        for (int i = 1; i <= N; ++i) {
            if (!nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int solveBySum(int[] a, int N) {
        int sum1 = 0;
        for (int i = 1; i <= N; ++i) {
            sum1 += i;
        }
        int sum2 = 0;
        for (int num : a) {
            sum2 += num;
        }
        return sum1 - sum2;
    }

    public static int solveByXOR(int[] a, int N) {
        int xor1 = 0;
        for (int i = 1; i <= N; ++i) {
            xor1 ^= i;
        }
        int xor2 = 0;
        for (int num : a) {
            xor2 ^= num;
        }
        return xor1 ^ xor2;
    }
}
