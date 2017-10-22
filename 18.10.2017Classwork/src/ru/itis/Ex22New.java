package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22New { //      2
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, Ans = 0;
        double t = 0.01;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] a = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100) - 50;
            System.out.print(a[i] + " ");
        }
        if (a[0] > 0) {
            t = t;
            for (int i = 1; i < n; i++) {
                if (a[i] > t) {
                } else {
                    t = -t;
                    Ans++;
                }
            }
        } else {
            t = -t;
            for (int i = 1; i < n; i++) {
                if (a[i] < t) {
                } else {
                    t = -t;
                    Ans++;
                }
            }
        }
        Ans++;
        System.out.println();
        System.out.println(Ans);
    }
}