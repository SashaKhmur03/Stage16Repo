package by.itstep.sasha.stage16.task03.util;

import by.itstep.sasha.stage16.task03.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class Initializer {
    public static final Random RND;
    public static final Scanner scanner;

    static {
        RND = new Random();
        scanner = new Scanner(System.in);
    }

    public static int[][] consoleInit(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = RND.nextInt(10);
            }
        }

        return matrix;
    }

    public static int readIntWithValidation(Scanner scanner, String message) {
        int num;
        while (true) {
            Printer.print(message);
            try {
                num = scanner.nextInt();
                if (num > 1) {
                    break;
                } else {
                    Printer.print("Error!");
                }
            } catch (Exception e) {
                Printer.print("Invalid input.");
                scanner.nextLine();
            }
        }
        return num;
    }
}
