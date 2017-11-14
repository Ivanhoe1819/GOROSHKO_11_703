package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {

    public static void Matrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random R = new Random();
        Scanner S = new Scanner(System.in);
        int matrix[][];
        int n, m, x;
        System.out.println("Размер матрицы");
        n = S.nextInt();
        m = S.nextInt();
        matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = R.nextInt(100);
            }
        }
        Matrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k <= matrix.length - 1; k++) {
                for (int a = 0; a < matrix[i].length - 1; a++) {
                    if (matrix[k][a] < matrix[k][a + 1]) {
                        x = matrix[k][a];
                        matrix[k][a] = matrix[k][a + 1];
                        matrix[k][a + 1] = x;
                    }
                }
            }
        }
        System.out.println();
        Matrix(matrix);
    }
}