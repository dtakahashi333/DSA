package com.fujarkojar.app.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FloydWarshallAlgorithmTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solve1() {
        int[][] mat = {{0, 2, -1, -1}, {1, 0, 3, -1}, {-1, -1, 0, -1}, {3, 5, 4, 0}};
        int[][] expected = {{0, 2, 5, -1}, {1, 0, 3, -1}, {-1, -1, 0, -1}, {3, 5, 4, 0}};
        FloydWarshallAlgorithm.solve(mat);
        assertArrayEquals(expected, mat);
    }

    @Test
    void solve2() {
        int[][] mat = {{0, 25}, {-1, 0}};
        int[][] expected = {{0, 25}, {-1, 0}};
        FloydWarshallAlgorithm.solve(mat);
        assertArrayEquals(expected, mat);
    }

    @Test
    void solve3() {
        int[][] mat = {{0, 1, 43}, {1, 0, 6}, {-1, -1, 0}};
        int[][] expected = {{0, 1, 7}, {1, 0, 6}, {-1, -1, 0}};
        FloydWarshallAlgorithm.solve(mat);
        assertArrayEquals(expected, mat);
    }

    @Test
    void solve4() {
//        Path currentRelativePath = Paths.get("");
//        String s = currentRelativePath.toAbsolutePath().toString();
//        System.out.println("Current absolute path is: " + s);
        try {
            // Open file readers.
            File inputFile = new File("testcases/FloydMarshallAlgorithm/fileInput.txt");
            Scanner inputReader = new Scanner(inputFile);
            File outputFile = new File("testcases/FloydMarshallAlgorithm/fileOutput.txt");
            Scanner outputReader = new Scanner(outputFile);
            int n = inputReader.nextInt();
            int[][] mat = new int[n][n];
            int[][] expected = new int[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    mat[i][j] = inputReader.nextInt();
                    expected[i][j] = outputReader.nextInt();
                }
            }
            FloydWarshallAlgorithm.solve(mat);
            assertArrayEquals(expected, mat);
            // Close the file reader.
            inputReader.close();
            outputReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}