package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22D {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n,t=0;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        Random R = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = R.nextInt(50);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (a[i] == a[k] && i != k) {
                    t++;
                }
            }
        }
        t=n-t;
        System.out.println(t);
    }
}
