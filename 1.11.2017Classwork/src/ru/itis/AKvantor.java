package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class AKvantor {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        Random R = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = R.nextInt(2);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean f = false;
        for (int i = 0; i < n && f; i++) {
            if (a[i] !=0) {
                f = false;
            }
        }
        if (f) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
