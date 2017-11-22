package ru.itis;

import java.util.Scanner;

public class Ex15V {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k = 1, c = 0;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        int[] v = new int[n];
        int[] x = new int[n];
        int[] z = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = 0;
        }
        z[c]=a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                k++;
            }
            if (a[i] < a[i - 1]) {
                v[c] = k;
                k = 1;
                x[c] = a[i-1];
                c++;
                z[c]=a[i];
            }
            if (i == n - 1) {
                v[c] = k;
                x[c]= a[i];
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}