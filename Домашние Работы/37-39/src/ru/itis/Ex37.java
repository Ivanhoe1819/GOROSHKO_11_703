package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex37 {

    public static void Matrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int matrix[][];
        int n, m = 1;
        System.out.println("Размер матрицы");
        n = s.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = r.nextInt(100);
            }
        }
        Matrix(matrix);
        for (int i = 0; i < n&&(i+1)<(n-m); i++) {
            for (int k = i + 1; k < n - m; k++) {
                matrix[i][k] = 0;
            }
            m++;
        }
        m=0;
        for (int i = n - 1; i > -1 && i < n; i--) {
            m++;
            for (int j = m; j < n && j < i; j++) {
                matrix[i][j] = 0;
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