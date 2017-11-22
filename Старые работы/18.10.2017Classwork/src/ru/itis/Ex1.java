package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, Ans = 0;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100);
            b[i] = ra.nextInt(100);
            Ans = Ans + (a[i] * b[i]);
        }
        System.out.println(Ans);
    }
}