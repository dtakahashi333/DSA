package com.fujarkojar.app.dp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingMailTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getMaxExpectedProfitByMemoization() {
        int N = 5;
        int[] V = new int[]{10, 2, 8, 6, 4};
        int C = 5;
        float S = 0f;
        double A = 25.00000000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 5;
        S = 1f;
        A = 9.00000000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.5f;
        A = 17.00000000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.15f;
        A = 20.10825000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
        N = 8;
        V = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        C = 4;
        S = 0.1f;
        A = 1.695328;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{4, 7, 4, 2, 5};
        C = 5;
        S = 0.3f;
        A = 8.160000801086426;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{385, 704, 400, 138, 521};
        C = 563;
        S = 0.3f;
        A = 661.099987;
        assertEquals(A, MissingMail.getMaxExpectedProfitByMemoization(N, V, C, S), 1e-6);
    }

    @Test
    void getMaxExpectedProfitByTabulation() {
        int N = 5;
        int[] V = new int[]{10, 2, 8, 6, 4};
        int C = 5;
        float S = 0f;
        double A = 25.00000000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 5;
        S = 1f;
        A = 9.00000000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.5f;
        A = 17.00000000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{10, 2, 8, 6, 4};
        C = 3;
        S = 0.15f;
        A = 20.10825000;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
        N = 8;
        V = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        C = 4;
        S = 0.1f;
        A = 1.695328;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{4, 7, 4, 2, 5};
        C = 5;
        S = 0.3f;
        A = 8.160000801086426;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
        N = 5;
        V = new int[]{385, 704, 400, 138, 521};
        C = 563;
        S = 0.3f;
        A = 661.099987;
        assertEquals(A, MissingMail.getMaxExpectedProfitByTabulation(N, V, C, S), 1e-6);
//        double a = ((((((1 * 0.9 + 1) * 0.9 + 1) * 0.9 + 1) * 0.9 + 1)* 0.9 + 1) * 0.9 + 1) * 0.9 + 1;
    }
}