package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex11New { //      2
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            x[i] = ra.nextInt(100);
        }
        for (int i = 0; i < n - 1; i++) {
            y[i] = x[i + 1];
        }
        y[n - 1] = x[0];
        for (int i = 1; i < n; i++) {
            z[i] = x[i - 1];
        }
        z[0] = x[n - 1];
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}