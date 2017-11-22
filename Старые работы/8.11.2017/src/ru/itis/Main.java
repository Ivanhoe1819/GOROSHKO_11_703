package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Start(int matrix[][]) {
        Scanner S = new Scanner(System.in);
        Random R = new Random();
        System.out.println("Entering N and M");
        int N = S.nextInt();
        int M = S.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = R.nextInt(100);
            }
        }
    }

    public static void Show(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void End(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {
            int [] min = new int[matrix[i].length];
            for (int k = 0; k<matrix[i].length; k++){
                min[k] = 101;
            }
            for (int j = 0; j < matrix[i].length; j++) {
            }
        }
    }
}
