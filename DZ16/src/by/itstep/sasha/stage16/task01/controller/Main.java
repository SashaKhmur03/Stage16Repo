package by.itstep.sasha.stage16.task01.controller;

import by.itstep.sasha.stage16.task01.model.MatrixWorker;
import by.itstep.sasha.stage16.task01.util.Convertor;
import by.itstep.sasha.stage16.task01.util.Initializer;
import by.itstep.sasha.stage16.task01.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage16.task01.util.Initializer.
        readIntWithValidation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");


        int[][] matrix = Initializer.readMatrixFromUser(rows, columns);
        int[] sums = MatrixWorker.calculateSumBetweenPositiveElements(matrix);

        Printer.print(Convertor.convert(matrix));

        Printer.print("The sums of the elements of each line: ");
        for (int i = 0; i < sums.length; i++) {
            Printer.print("Line " + (i + 1) + ": " + sums[i]);
        }
    }
}
