package by.itstep.sasha.stage16.task03.model;

public class MatrixManager{
    public static int findMaxElement(int[][] matrix) {
        int maxElement = matrix[0][0];

        for (int[] ints : matrix) {
            if (isAscending(ints) || isDescending(ints)) {
                int currentMax = ints[ints.length - 1];
                if (currentMax > maxElement) {
                    maxElement = currentMax;
                }
            }
        }

        return maxElement;
    }

    private static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
