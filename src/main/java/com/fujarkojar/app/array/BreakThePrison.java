package com.fujarkojar.app.array;

import java.util.Arrays;

// Break The Prison
// https://www.naukri.com/code360/problems/break-the-prison_1755915
public class BreakThePrison {

    public static int solve(int N, int M, int[] H, int[] V) {
        int[] hori = new int[N + 1];
        int[] vert = new int[M + 1];

        // Fill arrays with 0's.
        Arrays.fill(hori, 0);
        Arrays.fill(vert, 0);

        // Set indices where bars are removed to 1's.
        for (int i : H) {
            hori[i] = 1;
        }
        for (int i : V) {
            vert[i] = 1;
        }

        // Count the number of consecutive 1's in hori.
        int maxHori = 0;
        int horiCount = 0;
        for (int h : hori) {
            if (h == 1) {
                horiCount++;
            } else {
                if (horiCount > maxHori) {
                    maxHori = horiCount;
                }
                horiCount = 0;
            }
        }
        if (horiCount > maxHori) {
            maxHori = horiCount;
        }

        // Count the number of consecutive 1's in vert.
        int maxVert = 0;
        int vertCount = 0;
        for (int v : vert) {
            if (v == 1) {
                vertCount++;
            } else {
                if (vertCount > maxVert) {
                    maxVert = vertCount;
                }
                vertCount = 0;
            }
        }
        if (vertCount > maxVert) {
            maxVert = vertCount;
        }

        return (maxHori + 1) * (maxVert + 1);
    }
}
