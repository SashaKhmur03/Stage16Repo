package by.itstep.sasha.stage16.task05.model;

public class MatrixCounter {
    public static int findMaxConsecutiveCount(int[][] matrix) {
        int maxCount = 0;

        for (int[] ints : matrix) {
            int currentCount = 1;
            for (int j = 1; j < matrix[0].length; j++) {
                if (ints[j] > ints[j - 1]) {
                    currentCount++;
                } else {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                    currentCount = 1;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        return maxCount;
    }
}
