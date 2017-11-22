package ru.itis;
//Недоделанное
import java.util.Random;
import java.util.Scanner;

public class Ex39 {
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
        int n, m, z, t, h, l = 10,o=0,y=0;
        System.out.println("Размер матрицы");
        n = s.nextInt();
        m = s.nextInt();
        System.out.println("Размер массива");
        z = s.nextInt();
        matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = r.nextInt(10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
        int[] p = new int[z];
        int[] q = new int[z];
        int[] u = new int[z];
        System.out.println("Ввод массива");
        for (int i = 0; i < z; i++) {
            p[i] = s.nextInt();
        }
        for (int i = 0; i < z; i++) {
            System.out.print(p[i] + " ");
        }
        for (int i = 0; i < z; i++) {
            t = p[i];
            for (int k = 0; k < z; k++) {
                h = t % 10;
                t=t/10;
                q[k]=h;
                o++;
            }
        }
        for (int k = o-1; k>=0; k--) {
            u[y]=p[k];
            y++;
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
