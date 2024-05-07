package by.itstep.sasha.stage16.task05.util;

public class Convertor {
    public static String convert(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int[] array : matrix) {
            for (int number : array) {
                builder.append(number).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
