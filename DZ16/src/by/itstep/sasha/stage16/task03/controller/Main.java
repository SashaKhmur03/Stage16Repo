package by.itstep.sasha.stage16.task03.controller;

import by.itstep.sasha.stage16.task03.model.MatrixManager;
import by.itstep.sasha.stage16.task03.util.Convertor;
import by.itstep.sasha.stage16.task03.util.Initializer;
import by.itstep.sasha.stage16.task03.util.MatrixUI;
import by.itstep.sasha.stage16.task03.view.Printer;

import java.util.Scanner;

import static by.itstep.sasha.stage16.task03.util.Initializer.
        readIntWithValidation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readIntWithValidation(scanner, "Enter rows: ");
        int columns = readIntWithValidation(scanner, "Enter columns: ");

        int[][] matrix =  Initializer.consoleInit(rows, columns);
        Printer.print(Convertor.convert(matrix));
        int maxElement = MatrixManager.findMaxElement(matrix);
        String msg = MatrixUI.formatResult(maxElement);
        Printer.print(msg);
    }
}
