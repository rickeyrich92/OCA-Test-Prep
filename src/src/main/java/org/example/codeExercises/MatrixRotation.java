package org.example.codeExercises;

import java.util.Scanner;

//Program starts and asks user to specify matrix size. For example if user entered ‘5’ program
// will generate next matrix:
//
//        0.0 0.1 0.2 0.3 0.4
//        1.0 1.1 1.2 1.3 1.4
//        2.0 2.1 2.2 2.3 2.4
//        3.0 3.1 3.2 3.3 3.4
//        4.0 4.1 4.2 4.3 4.4
//
//Program asks user this question with options:
//How much do you want to rotate matrix?
//        - Press 1 to rotate matrix to 90 degrees
//- Press 2 to rotate matrix to 180 degrees
//- Press 3 to rotate matrix to 270 degrees
//
//When user chosen rotation mode programs prints initial matrix and rotated one.
//
//Rotation for 90 degrees looks like this:
//        4.0 3.0 2.0 1.0 0.0
//        4.1 3.1 2.1 1.1 0.1
//        4.2 3.2 2.2 1.2 0.2
//        4.3 3.3 2.3 1.3 0.3
//        4.4 3.4 2.4 1.4 0.4
//
//Rotation for 180 degrees looks like this:
//        4.4 4.3 4.2 4.1 4.0
//        3.4 3.3 3.2 3.1 3.0
//        2.4 2.3 2.2 2.1 2.0
//        1.4 1.3 1.2 1.1 1.0
//        0.4 0.3 0.2 0.1 0.0
//
//Rotation for 270 degrees looks like this:
//        0.4 1.4 2.4 3.4 4.4
//        0.3 1.3 2.3 3.3 4.3
//        0.2 1.2 2.2 3.2 4.2
//        0.1 1.1 2.1 3.1 4.1
//        0.0 1.0 2.0 3.0 4.0


public class MatrixRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
    }

    private static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Double.valueOf(Integer.toString(i) + "."
                        + Integer.toString(j));
            }
        }
        return matrix;
    }

    private static void printMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static boolean rotateMatrix(double[][] matrix, int mode) {
        switch (mode) {
            case 1:
                System.out.println("90 degrees rotated:" + System.lineSeparator());
                rotate90(matrix);
                break;
            case 2:
                System.out.println("180 degrees rotated:" + System.lineSeparator());
                rotate180(matrix);
                break;
            case 3:
                System.out.println("270 degrees rotated:" + System.lineSeparator());
                rotate270(matrix);
                break;
            default:
                System.out.println("You selected non-existing mode!");
                return false;
        }
        return true;
    }

    public static void rotate90(double[][] matrix) {

    }

    public static void rotate180(double[][] matrix) {

    }

    public static void rotate270(double[][] matrix) {

    }
}
