package by.itstep.sasha.stage16.task01.model;

public class MatrixWorker {
    public static int[] calculateSumBetweenPositiveElements(int[][] matrix) {
        int[] sums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            boolean firstPositiveFound = false;
            int firstPositiveIndex = -1;
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    if (!firstPositiveFound) {
                        firstPositiveIndex = j;
                        firstPositiveFound = true;
                    } else {
                        for (int k = firstPositiveIndex + 1; k < j; k++) {
                            sum += matrix[i][k];
                        }
                        break;
                    }
                }
            }

            sums[i] = sum;
        }

        return sums;
    }
}