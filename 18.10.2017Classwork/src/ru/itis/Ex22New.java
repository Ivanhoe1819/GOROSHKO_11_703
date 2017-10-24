package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22New { //      Б
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, Ans = 0, k = 0;
        double t = 0.01;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] a = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100) - 50;
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n-1; i++) {
        if (a[i] < 0 && a[i+1] >= 0 || a[i] >= 0 && a[i+1] < 0)
            Ans++;
        }
        System.out.println();
        System.out.println(Ans);
    }
}