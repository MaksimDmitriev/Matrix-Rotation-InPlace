package com.app;

public class Solution {

    public void rotate(int[][] matrix) {
        /*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix[2][1] = 8
        */

        final int N = matrix.length;
        for (int i = 0; i < N - 1; i++) {
            int t = matrix[0][i];
            matrix[0][i] = matrix[N - 1][0];
            matrix[N - 1][0] = matrix[N - 1][N - 1];
            matrix[N - 1][N - 1] = matrix[0][N - 1];
            matrix[0][N - 1] = t;
        }
    }
}
