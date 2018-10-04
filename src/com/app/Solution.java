package com.app;

public class Solution {

    public void rotate(int[][] matrix, int rowIndex, int colIndex, int hi) {
        /*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix[2][1] = 8
        */

        int offset = 0;
        for (int i = colIndex; i < hi - 1; i++) {
            int t = matrix[rowIndex][i];
            matrix[rowIndex][i] = matrix[hi - 1 - offset][rowIndex];
            matrix[hi - 1 - offset][rowIndex] = matrix[hi - 1][hi - 1 - offset];
            matrix[hi - 1][hi - 1 - offset] = matrix[i][hi - 1];
            matrix[i][hi - 1] = t;
            offset++;
        }
        if (colIndex + 1 < hi - 1) {
            rotate(matrix, rowIndex + 1, colIndex + 1, hi - 1);
        }
    }
}
