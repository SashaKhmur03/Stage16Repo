package by.itstep.sasha.stage16.task06.util;

import java.util.Random;
import java.util.Scanner;

import static by.itstep.sasha.stage16.task06.model.VectorWorker.sortVector;

public class Initializer {
    public static final Random RND;
    public static final Scanner scanner;

    static {
        RND = new Random();
        scanner = new Scanner(System.in);
    }

    public static int[] initVector(int size) {
        int[] vector = new int[size];

        for (int i = 0; i < size; i++) {
            vector[i] = RND.nextInt(100);
        }

        sortVector(vector);

        return vector;
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
