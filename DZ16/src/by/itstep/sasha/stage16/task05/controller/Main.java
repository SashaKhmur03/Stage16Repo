package by.itstep.sasha.stage16.task05.controller;

import by.itstep.sasha.stage16.task05.util.Convertor;
import by.itstep.sasha.stage16.task05.util.Initializer;
import by.itstep.sasha.stage16.task05.util.MatrixUI;
import by.itstep.sasha.stage16.task05.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage16.task05.model.MatrixCounter.
        findMaxConsecutiveCount;
import static by.itstep.sasha.stage16.task05.util.Initializer.
        readIntWithValidation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");

        int[][] matrix = Initializer.generateMatrix(rows, columns);
        Printer.print(Convertor.convert(matrix));
        int maxCount = findMaxConsecutiveCount(matrix);
        String msg = MatrixUI.formatResult(maxCount);

        Printer.print(msg);
    }
}
