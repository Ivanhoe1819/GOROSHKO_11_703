package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex38 {
    public static void Matrix(double matrix[][]) {
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
        double matrix[][];
        double t = 1;
        int n, g = 0;
        System.out.println("Размер матрицы");
        n = s.nextInt();
        double[] b = new double[n];
        matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = r.nextInt(10);
            }
        }
        Matrix(matrix);
        while (g < n) {
            for(int i = g;i<n;i++){
                if (matrix[g][i]==0){

                }
            }
            for (int i = g; i < n; i++) {
                if (matrix[i][g] == 0) {
                    matrix[i][g] = 1;
                }
                t = t * matrix[i][g];
                b[i] = matrix[i][g];
            }
            System.out.println(t);
            for (int i = g; i < n; i++) {
                for (int k = g; k < n; k++) {
                    matrix[i][k] = ((matrix[i][k] / b[i]) * t);
                }
            }
            for (int i = g + 1; i < n; i++) {
                for (int k = g; k < n; k++) {
                    matrix[i][k] = matrix[g][k] - matrix[i][k];
                }
            }
            g++;
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