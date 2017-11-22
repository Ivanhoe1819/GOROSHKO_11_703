package ru.itis;

import java.util.Scanner;
import java.util.Random;

public class Ex1Class {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k=0, c;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        c = a[0];
        Random ra = new Random();
        for (int i = 1; i < n; i++) {
            a[i] = ra.nextInt(10);
            System.out.print(a[i]+", ");
            if (a[i] <= c) {
                if (a[i] < c) {
                    c = a[i];
                    k=0;
                }
                else {
                    k++;
                }
            }
        }
        System.out.println();
        System.out.println(c);
        System.out.println(k);
    }
}
