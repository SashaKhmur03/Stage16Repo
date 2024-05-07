package by.itstep.sasha.stage16.task04.controller;

import by.itstep.sasha.stage16.task04.util.Convertor;
import by.itstep.sasha.stage16.task04.util.Initializer;
import by.itstep.sasha.stage16.task04.util.MatrixUI;
import by.itstep.sasha.stage16.task04.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage16.task04.model.MatrixCalculator.
        findLongestSeriesRow;
import static by.itstep.sasha.stage16.task04.util.Initializer.
        readIntWithValidation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");

        int[][] matrix = Initializer.consoleInit(rows, columns);
        Printer.print(Convertor.convert(matrix));
        int longestSeriesRow = findLongestSeriesRow(matrix);
        String msg = MatrixUI.formatResult(longestSeriesRow);
        Printer.print(msg);
    }
}
