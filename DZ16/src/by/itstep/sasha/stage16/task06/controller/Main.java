package by.itstep.sasha.stage16.task06.controller;

import by.itstep.sasha.stage16.task06.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

import static by.itstep.sasha.stage16.task06.model.VectorWorker.mergeVectors;
import static by.itstep.sasha.stage16.task06.util.Initializer.initVector;
import static by.itstep.sasha.stage16.task06.util.Initializer.readIntWithValidation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA = readIntWithValidation(scanner, "Input vector size a: ");
        int sizeB = readIntWithValidation(scanner, "Input vector size b: ");

        int[] a = initVector(sizeA);
        int[] b = initVector(sizeB);

        Printer.print("Vector a: " + Arrays.toString(a));
        Printer.print("\n" + "Vector b: " + Arrays.toString(b));

        int[] c = mergeVectors(a, b);
        Printer.print("\n" + "Sorted vector c: " + Arrays.toString(c));
    }
}
