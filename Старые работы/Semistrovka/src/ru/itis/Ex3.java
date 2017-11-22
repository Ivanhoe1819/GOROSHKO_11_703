package ru.itis;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n, j;
        double F, eps;
        Scanner A = new Scanner(System.in);
        System.out.println("Entering N");
        n = A.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        boolean f = false;
        System.out.println("Entering A0");
        a[0] = A.nextDouble();
        System.out.println("Entering B0");
        b[0] = A.nextDouble();
        System.out.println("Entering Eps");
        eps = A.nextDouble();
        for (j = 1; j < n - 1; j++) {
            a[j] = ((1 - a[j - 1]) / (1 - (b[j - 1] * b[j - 1]))) * Math.sin((a[j - 1] * a[j - 1]) + (a[j - 1] * b[j - 1]) + 2);
            b[j] = (Math.log(1 + (b[0] * b[0]))) / (Math.log(1 + (a[0] * a[0])));
        }
        for (j = 1; j < n - 1; j++) {
            for (int k = 1; k < n - 1; k++) {
                F = a[j] - b[k];
                if (F < eps) {
                    f = true;
                    break;
                }
            }
            if (f) {
                System.out.println(a[j]);
                f = false;
            }
        }
    }
}
