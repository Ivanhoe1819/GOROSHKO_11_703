package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex6 { //      1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        y[0] = 0;
        z[0] = 0;
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            x[i] = ra.nextInt(100);
        }
        for (int i = 1; i < n; i++) {
            if (x[i] * x[i - 1] > 0) {
                y[i] = 1;
            } else {
                y[i] = 0;
            }
            if (x[i - 1] > x[i]) {
                z[i] = 1;
            } else {
                z[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}