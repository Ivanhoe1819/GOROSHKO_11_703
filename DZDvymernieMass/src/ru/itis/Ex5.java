package ru.itis;//+-

import java.util.Random;
import java.util.Scanner;

public class Ex5 {

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
        int n, z = 0, q = 0;
        boolean p = true;
        System.out.println("Размер матрицы");
        n = S.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = S.nextInt();//R.nextInt(100);
            }
        }
        Matrix(matrix);
        for (int k = 0; k < matrix.length; k++) {
            z = z + matrix[0][k];
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                q = q + matrix[i][k];
            }
            if (q != z) {
                p = false;
                break;
            }
            q=0;
        }
        if (!p) {
            System.out.println("Обычная");
            return;
        }
        q = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                q = q + matrix[k][i];
            }
            if (q != z) {
                p = false;
                break;
            }
            q=0;
        }
        if (!p) {
            System.out.println("Обычная");
            return;
        }
        q = 0;
        for (int i = 0; i < matrix.length; i++) {
            q = q + matrix[i][i];
        }
        if (q != z) {
            System.out.println("Обычная");
            return;
        }
        q = 0;
        int k = n - 1;
        for (int i = 0; i < matrix.length && k >= 0; i++) {
            q = q + matrix[i][k];
            k--;
        }
        if (q != z) {
            System.out.println("Обычная");
            return;
        }
        System.out.println("Магический квадрат");
    }
}