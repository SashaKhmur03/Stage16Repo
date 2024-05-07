package by.itstep.sasha.stage16.task02.controller;

import by.itstep.sasha.stage16.task02.util.Convertor;
import by.itstep.sasha.stage16.task02.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage16.task02.model.MatrixLogic.
        findMonotonicColumns;
import static by.itstep.sasha.stage16.task02.util.Initializer.
        generateRandomMatrix;
import static by.itstep.sasha.stage16.task02.util.Initializer.
        readIntWithValidation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");

        int[][] matrix = generateRandomMatrix(rows, columns);
        Printer.print(Convertor.convert(matrix));

        int[] monotonicColumns = findMonotonicColumns(matrix);

        Printer.print("Column numbers with monotonic sequence: ");
        for (int monotonicColumn : monotonicColumns) {
           Printer.print(String.valueOf(monotonicColumn + 1));
        }
    }
}
