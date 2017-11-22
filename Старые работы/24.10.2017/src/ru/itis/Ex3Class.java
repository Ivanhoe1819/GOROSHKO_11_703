package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex3Class {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, v = 1, max = 0;
        double S = 1;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = ra.nextInt(100);
            System.out.print(a[i] + ", ");
            if (a[i] > max) {
                max = a[i];
                v = i;
            }
        }
        for (int i = v + 1; i < n; i++) {
            if (a[i] != 0) {
                S *= a[i];
            }
        }
        System.out.println();
        System.out.println(S);
    }
}
