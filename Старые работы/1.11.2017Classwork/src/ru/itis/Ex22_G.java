package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22_G {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n;
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
        boolean f = false;
        for (int i = 0; i < n && !f; i++) {
            for (int k = 0; k < i && !f; k++) {
                if (a[i] == a[k]) {
                    f = true;
                }
            }
        }
        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
