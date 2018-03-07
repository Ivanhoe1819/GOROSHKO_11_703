package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, m;
        System.out.println("Какого размера?");
        n = s.nextInt();
        m = s.nextInt();
        int[][] matrix = new int[n][m];
        readMatrix(matrix);
        showMatrix(matrix);
        System.out.println(analyse(matrix));
    }

    private static void readMatrix(int matrix[][]) {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = r.nextInt(50);
            }
        }
    }

    private static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isOrderAsc(int arr []) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean analyse(int matrix[][]) {
        for (int [] row: matrix) {
            boolean f = isOrderAsc(row);
            if (!f) {
                return false;
            }
        }
        return true;
    }
}
