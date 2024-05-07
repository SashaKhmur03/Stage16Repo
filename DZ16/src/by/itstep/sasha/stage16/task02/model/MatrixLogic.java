package by.itstep.sasha.stage16.task02.model;

import java.util.Arrays;

public class MatrixLogic {
    public static int[] findMonotonicColumns(int[][] matrix) {
        int[] monotonicColumns = new int[matrix[0].length];
        int count = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            boolean isIncreasing = true;
            boolean isDecreasing = true;

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] > matrix[i - 1][j]) {
                    isDecreasing = false;
                } else if (matrix[i][j] < matrix[i - 1][j]) {
                    isIncreasing = false;
                }

                if (!isIncreasing && !isDecreasing) {
                    break;
                }
            }

            if (isIncreasing || isDecreasing) {
                monotonicColumns[count] = j;
                count++;
            }
        }

        return Arrays.copyOf(monotonicColumns, count);
    }
}
