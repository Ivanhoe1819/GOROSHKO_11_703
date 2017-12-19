package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Zadachimass1 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int matrix[][];
        int n, m, min, q, p;
        System.out.println("Размер матрицы");
        n = s.nextInt();
        m = s.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = r.nextInt(100);
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Заглушка");
        matrix = new int[n + 1][m];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = r.nextInt(100);
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
            p = i;
            for (int k = i - 1; k >= 0; k--) {
                if (matrix[k][0] <= min) {
                    min = matrix[k][0];
                    p = k;
                }
            }
            q = matrix[p][0];
            matrix[p][0] = matrix[i][0];
            matrix[i][0] = q;
        }
        for (int i = n; i >= 0; i--) {
            if (a[0] > matrix[i - 1][0]) {
                for (int k = 0; k < matrix[i].length; k++) {
                    q = matrix[i - 1][k];//Замена... Не нашел альтернативы. Извините
                    q = matrix[i - 1][k];                       //why?
                    matrix[i - 1][k] = matrix[i][k];
                    matrix[i][k] = q;
                }
            } else {
                for (int k = 0; k < matrix[i].length; k++) {
                    matrix[i][k] = a[k];
                }
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }
}
