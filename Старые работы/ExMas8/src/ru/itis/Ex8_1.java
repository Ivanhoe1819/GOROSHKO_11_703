package ru.itis;

import java.util.Scanner;
import java.util.Random;

public class Ex8_1 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int m, g, card = 0;
        System.out.println("Entering M");
        m = q.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] b1 = new int[m];
        int[] x = new int[m];
        Random R = new Random();
        for (int k = 0; k < m; k++) {
            a[k] = R.nextInt(10);
            System.out.print(a[k] + " ");
        }
        System.out.println();
        for (int k = 0; k < m; k++) {
            b[k] = R.nextInt(10);
            System.out.print(b[k] + " ");
        }
        System.out.println();
        for (int k = 0; k < m; k++) {
            g = a[k];
            for (int i = 0; i < m; i++) {
                if (g == b[i]) {
                    b1[k] = 1;
                }
            }
            if (b1[k] == 1) {
                card++;
            }
        }
        System.out.println();
        System.out.print(card);
    }
}
