package ru.itis;

import java.util.Scanner;
import java.util.Random;

public class Ex2Class {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, v = 1, c = 1, k = 0, min = 100, max = 0;
        double h, S=0;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100);
            System.out.print(a[i] + ", ");
            if (a[i] < min) {
                min = a[i];
                c = i;
            }
            if (a[i] > max) {
                max = a[i];
                v = i;
            }
        }
        if (v > c) {
            for (int i = c+1; i < v; i++) {
                S= S + a[i];
            }
        }
        if (v < c) {
            for (int i = v+1; i < c; i++) {
                S= S + a[i];
            }
        }
        System.out.println();
        System.out.println(S);
    }
}
