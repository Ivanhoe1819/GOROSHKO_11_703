package ru.itis;

import java.util.Scanner;
import java.util.Random;

public class Zadachimass3 {
    public static void readMatrix(int matrix[][]) {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(2);
            }
        }
    }

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void simullation(int matrix[][]) {
        boolean d = false;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int k = i + 1; k < matrix.length; k++) {//В данном случае необходимо, т.к иначе не просчитать последующие строки (По-крайней мере, я не нашел альтернативы. Извините
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == matrix[k][j]) {   //why so strange? Such do not write!
                    } else {
                        d = true;
                        break;
                    }
                }
                if (d) {        //why so strange? Such do not write!  if (B) S1; or if (B) S1; else s2;
                } else {
                    System.out.println("Есть");
                    return;
                }
                d = false;

            }
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Размер матрицы");
        int n = s.nextInt();
        int m = s.nextInt();
        int matrix[][] = new int[n][m];
        readMatrix(matrix);
        showMatrix(matrix);
        simullation(matrix);
    }
}
//P.S.:Извините, ДЗ на 13 не смог, с вашего разрешения, отправлю позже.
