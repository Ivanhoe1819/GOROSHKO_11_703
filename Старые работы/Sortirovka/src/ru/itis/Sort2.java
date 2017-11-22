package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Sort2 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        Random R = new Random();
        int max, z, x, n;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = R.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            max = a[i];
            z = i;
            for (int k = i + 1; k < n; k++) {
                if (a[k] <= max) {
                    max = a[k];
                    z = k;
                }
            }
            x = a[z];
            a[z] = a[i];
            a[i] = x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
