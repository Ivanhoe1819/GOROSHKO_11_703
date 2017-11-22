package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22NewNew { //      Б
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, Ans = 0;
        double z1, z2, t = 2, k, x, l;
        System.out.println("Entering n");
        n = s.nextInt();
        double[] a = new double[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            k = a[i];
            l = 0;
            while (t <= k && k >= 2) {
                z1 = k / t;
                x = k % t;
                z2 = z1 - x;
                t++;
                if (z1 == z2) {
                    l++;
                }
            }
            if (l == 1) {
                Ans++;
            }
        }
        System.out.println();
        System.out.println(Ans);
    }
}