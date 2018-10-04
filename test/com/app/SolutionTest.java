package com.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void empty() {
        Solution solution = new Solution();
        int[][] matrix = {
                {}
        };
        solution.rotate(matrix, 0, 0, matrix.length);
    }

    @Test
    void single() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1}
        };
        solution.rotate(matrix, 0, 0, matrix.length);
        assertEquals(1, matrix[0][0]);
    }

    @Test
    void twoByTwo() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 1},
                {2, 2}
        };

        solution.rotate(matrix, 0, 0, matrix.length);

        int[][] expected = {
                {2, 1},
                {2, 1}
        };

        assertTrue(Arrays.deepEquals(expected, matrix));
    }

    @Test
    void threeByThree() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        solution.rotate(matrix, 0, 0, matrix.length);

        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        assertTrue(Arrays.deepEquals(expected, matrix));
    }

    @Test
    void fourByFour() {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        solution.rotate(matrix, 0, 0, matrix.length);

        int[][] expected = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        assertTrue(Arrays.deepEquals(expected, matrix));
    }
}