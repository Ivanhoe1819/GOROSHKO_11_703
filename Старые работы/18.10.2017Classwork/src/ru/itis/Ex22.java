package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22 { //      1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, Ans = 0;
        System.out.println("Entering n");
        n = s.nextInt();
        int[] a = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100);
            if (a[i] > 0) {
                Ans = Ans + a[i];
            }
        }
        System.out.println(Ans);
    }
}