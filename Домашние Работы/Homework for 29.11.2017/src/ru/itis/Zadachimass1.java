package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Zadachimass1 {

    public static void main(String[] args) {
        Random R = new Random();
        Scanner S = new Scanner(System.in);
        int matrix[][];
        int n, m, t, min, p = 0;
        boolean f = false;
        System.out.println("Размер матрицы");
        n = S.nextInt();
        m = S.nextInt();
        matrix = new int[n + 1][m];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = R.nextInt(100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = (matrix.length - 1); i >= 0; i--) {
            min = matrix[i][0];
            t = i;
            for (int j = i - 1; j >= 0; j--) {
                if (matrix[j][0] <= min) {
                    min = matrix[j][0];
                    t = j;
                }
            }
            t = matrix[i][0];
            matrix[i][0] = matrix[t][0];
            matrix[t][0] = t;
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();

        }
        System.out.println(p);
    }
}