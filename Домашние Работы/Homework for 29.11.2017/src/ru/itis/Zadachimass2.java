package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Zadachimass2 {
    public static void readMatrix(int matrix[][]) {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
    }

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matrixA[][];
        int matrixB[][];
        int matrixC[][];
        int n, m, q, z = 0;
        System.out.println("Размер матрицы");
        n = s.nextInt();
        m = s.nextInt();
        q = s.nextInt();
        matrixA = new int[n][m];
        matrixB = new int[m][q];
        matrixC = new int[n][q];
        readMatrix(matrixA);
        showMatrix(matrixA);
        readMatrix(matrixB);
        showMatrix(matrixB);
        for (int i = 0; i < matrixC.length; i++) {
            for (int k = 0; k < matrixC[i].length; k++) {
                z = 0;
                for (int j = 0; j < matrixA[i].length; j++) {
                    z = z + matrixA[k][j] * matrixB[j][i];
                }
                matrixC[k][i] = z;
            }
        }
        showMatrix(matrixC);
    }
}