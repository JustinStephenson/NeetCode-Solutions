package org.example.problems.binary_search;

public class SearchTwoDimensionalMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int NUM_ROWS = matrix.length;
        final int NUM_COL = matrix[0].length;

        int top = 0;
        int bottom = NUM_ROWS - 1;

        while (top <= bottom) {
            int middleRow = top + (bottom - top) / 2;

            if (matrix[middleRow][0] > target) {
                bottom = middleRow - 1;
            } else if (matrix[middleRow][NUM_COL - 1] < target) {
                top = middleRow + 1;
            } else {
                break;
            }
        }

        if (!(top <= bottom)) {
            return false;
        }

        int left = 0;
        int right = NUM_COL - 1;
        int middleRow = top + (bottom - top) / 2;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (matrix[middleRow][middle] == target) {
                return true;
            }

            if (matrix[middleRow][middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }
}
