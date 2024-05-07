package by.itstep.sasha.stage16.task02.util;

import java.util.Random;
import java.util.Scanner;

public class Initializer {
    public static final Random RND;

    static {
        RND = new Random();
    }
    public static int[][] generateRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = RND.nextInt(10);
            }
        }

        return matrix;
    }

    public static int readIntWithValidation(Scanner scanner, String message) {
        int num;
        while (true) {
            System.out.print(message);
            try {
                num = scanner.nextInt();
                if (num > 1) {
                    break;
                } else {
                    System.out.println("Error!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
        }
        return num;
    }
}
