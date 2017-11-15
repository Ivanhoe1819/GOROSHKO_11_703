package ru.itis;

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
        int n, m, z = 0, q = 0, p = 0;
        boolean f = false, g = false, j = false, h = false;
        System.out.println("Размер матрицы");
        n = S.nextInt();
        m = S.nextInt();
        matrix = new int[n][m];
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
            if (q == z) {
                p++;
                q = 0;
            }
        }
        if (p == matrix.length) {
            f = true;
            System.out.println(f);
        }
        q = 0;
        p = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                q = q + matrix[k][i];
            }
            if (q == z) {
                p++;
                q = 0;
            }
        }
        if (p == matrix.length) {
            g = true;
            System.out.println(g);
        }
        q = 0;
        for (int i = 0; i < matrix.length; i++) {
            q = q + matrix[i][i];
        }
        if (q == z) {
            h = true;
            System.out.println(h);
        }
        q = 0;
        int k = m - 1;
        for (int i = 0; i < matrix.length && k >= 0; i++) {
            q = q + matrix[i][k];
            k--;
        }
        if (q == z) {
            j = true;
            System.out.println(j);
        }
        if (f == true && g == true && h == true && j == true) {
            System.out.println("МАГИЧЕСКИЙ КВАДРАТ!!!");
        } else {
            System.out.println("Обычная матрица");
        }
    }
}