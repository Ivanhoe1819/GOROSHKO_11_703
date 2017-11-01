package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Sort4 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        Random r = new Random();
        int n, k, g;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (k = 0; k < n; k++) {
            for (int i = k + 1; i < n; i++) {
                if (a[k] < a[i]) {
                    g = a[k];
                    a[k] = a[i];
                    a[i] = g;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}