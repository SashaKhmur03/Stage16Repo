package by.itstep.sasha.stage16.task04.model;

public class MatrixCalculator {
    public static int findLongestSeriesRow(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int longestSeriesRow = -1;
        int longestSeriesLength = 0;

        for (int i = 0; i < rows; i++) {
            int currentSeriesLength = 1;
            int maxSeriesLength = 1;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == matrix[i][j - 1]) {
                    currentSeriesLength++;
                } else {
                    if (currentSeriesLength > maxSeriesLength) {
                        maxSeriesLength = currentSeriesLength;
                    }
                    currentSeriesLength = 1;
                }
            }

            if (currentSeriesLength > maxSeriesLength) {
                maxSeriesLength = currentSeriesLength;
            }

            if (maxSeriesLength > longestSeriesLength) {
                longestSeriesLength = maxSeriesLength;
                longestSeriesRow = i;
            }
        }

        return longestSeriesRow;
    }
}
