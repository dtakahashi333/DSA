package com.fujarkojar.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingMailTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getMaxExpectedProfitByMemoization1() {
        int N = 5;
        int[] V = new int[]{10, 2, 8, 6, 4};
        int C = 5;
        float S = 0f;
        assertEquals(25.00000000, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 5;
        S = 1f;
        assertEquals(9.00000000, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.5f;
        assertEquals(17.00000000, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.15f;
        assertEquals(20.10825000, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
        N = 8;
        V = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        C = 4;
        S = 0.1f;
//        A = 1.695328
        assertEquals(1.695328, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
        N = 5;
        V = new int[]{4, 7, 4, 2, 5};
        C = 5;
        S = 0.3f;
//        A =
        assertEquals(8.160000801086426, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
        N = 5;
        V = new int[]{385, 704, 400, 138, 521};
        C = 563;
        S = 0.3f;
//        A = 661.1
        assertEquals(661.1, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S));
    }

    @Test
    void getMaxExpectedProfitByTabulation() {
        int N = 5;
        int[] V = new int[]{10, 2, 8, 6, 4};
        int C = 5;
        float S = 0f;
        assertEquals(25.00000000, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 5;
        S = 1f;
        assertEquals(9.00000000, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.5f;
        assertEquals(17.00000000, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.15f;
//        assertEquals(20.10825000, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
        N = 8;
        V = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        C = 4;
        S = 0.1f;
//        A = 1.695328
//        assertEquals(1.695328, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
        N = 5;
        V = new int[]{4, 7, 4, 2, 5};
        C = 5;
        S = 0.3f;
//        A =
        assertEquals(8.160000801086426, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
        N = 5;
        V = new int[]{385, 704, 400, 138, 521};
        C = 563;
        S = 0.3f;
//        A = 661.1
        assertEquals(661.1, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S));
//        double a = ((((((1 * 0.9 + 1) * 0.9 + 1) * 0.9 + 1) * 0.9 + 1)* 0.9 + 1) * 0.9 + 1) * 0.9 + 1;
    }
}