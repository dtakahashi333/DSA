package com.fujarkojar.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // ClimbingStairs
        System.out.println(ClimbingStairs.solveByTabulation(51));
        // HouseRobber2
//        int[] valueInHouse = new int[]{55, 19, 21, 13, 10, 67};
        int[] valueInHouse = new int[]{4, 1, 6, 10};
        System.out.println(HouseRobber.solveByMemoization(valueInHouse));
        System.out.println(HouseRobber.solveByTabulation(valueInHouse));
        // SubarrayWithMaximumProduct
        int[] arr = new int[]{1, -2, 3, -4};
        System.out.println(SubarrayWithMaximumProduct.solveByOptimal(arr));
    }
}
