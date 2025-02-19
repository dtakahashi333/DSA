package com.fujarkojar.app.greedy;

import com.fujarkojar.app.graph.FloydWarshallAlgorithm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Fractional Knapsack
// https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
// https://takeuforward.org/data-structure/fractional-knapsack-problem-greedy-approach/
// https://www.youtube.com/watch?v=1ibsQrnuEEg
public class FractionalKnapsack implements Comparator<Double[]> {

    /*
     * Function to get the maximum total value in the knapsack.
     */
    public static double solve(List<Integer> val, List<Integer> wt, int capacity) {
        int n = val.size();
        // Store unit values.
        Double[][] unitVal = new Double[n][2];
        for (int i = 0; i < n; ++i) {
            unitVal[i][0] = (double) val.get(i) / wt.get(i); // value per weight
            unitVal[i][1] = (double) wt.get(i); // weight
        }
        // Sort unitVal in the descending order.
        Arrays.sort(unitVal, new FractionalKnapsack());

        double totalVal = 0.0;
        for (int i = 0; i < n; ++i) {
            if (unitVal[i][1] < capacity) {
                totalVal += unitVal[i][0] * unitVal[i][1];
                capacity -= unitVal[i][1];
            } else {
                totalVal += unitVal[i][0] * capacity;
                capacity = 0;
                break;
            }
        }

        // Create a BigDecimal from the double
        BigDecimal bd = new BigDecimal(totalVal);

        // Round to 6 decimal places using HALF_UP rounding mode
        bd = bd.setScale(6, RoundingMode.HALF_UP);

        // Convert the BigDecimal back to a double and return
        return bd.doubleValue();
    }

    @Override
    public int compare(Double[] o1, Double[] o2) {
        if (o2[0] > o1[0]) {
            return 1;
        } else if (o2[0] < o1[0]) {
            return -1;
        } else {
            return 0;
        }
    }
}
