package ru.itis;

import java.util.Scanner;

public class Ex15A {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k = 1, c = 0, min, max;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        int[] v = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                k++;
            }
            if (a[i] < a[i - 1]) {
                v[c] = k;
                k = 1;
                c++;
            }
            if (i == n - 1) {
                v[c] = k;
            }
        }
        min = v[0];
        max = v[0];
        for (int i = 1; i < n; i++) {
            if (min > v[i] && v[i] >= 1) {
                min = v[i];
            }
            if (max < v[i]) {
                max = v[i];
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}