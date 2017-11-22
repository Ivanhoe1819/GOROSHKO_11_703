package ru.itis;

import java.util.Scanner;

public class Ex13_V {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k = 1;
        double c;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        int[] v = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                k++;
            }
            if (a[i] != a[i - 1]) {
                v[k - 1]++;
                k = 1;
            }
            if (i == n - 1) {
                v[k - 1]++;
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}