package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

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
        int n, m;
        System.out.println("Размер мтарицы");
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
            for (int k = i + 1; k < matrix.length; k++) {
                int a = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = a;
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }
}