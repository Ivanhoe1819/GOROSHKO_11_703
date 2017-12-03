package ru.itis;

import java.util.Random;
import java.util.Scanner;

//АЕБГ
public class Ex10 {
    public static void readMatrix(double matrix[][]) {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
    }

    public static void showMatrix(double matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void compare(double matrixA[][], double matrixB[][]) {
        for (int i = 0; i < matrixA.length; i++) {
            if (matrixA[i][1] > matrixA[i][2]) {
                for (int k = 0; k < matrixA[i].length; k++) {
                    matrixB[i][k] = Math.atan(1 + matrixA[i][k]) - 3 * matrixA[i][k];
                }
            } else {
                for (int k = 0; k < matrixA[i].length; k++) {
                    matrixB[i][k] = matrixA[i][k] + Math.cos((matrixA[i][k] * matrixA[i][k]) - 0.8);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double matrixA[][];
        double matrixB[][];
        int n, m;
        System.out.println("Введите размерность");
        n = s.nextInt();
        m = s.nextInt();
        matrixA = new double[n][m];
        matrixB = new double[n][m];
        readMatrix(matrixA);
        showMatrix(matrixA);
        compare(matrixA, matrixB);
        showMatrix(matrixB);
    }
}
