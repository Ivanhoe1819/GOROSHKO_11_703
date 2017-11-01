package ru.itis;

import java.util.Scanner;

public class Ex1FirstD {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int j, n;
        double b, a1, a2, a3, x, h, F;
        System.out.println("Entering N");
        n = q.nextInt();
        System.out.println("Entering B");
        b = q.nextInt();
        System.out.println("Entering H");
        h = q.nextInt();
        System.out.println("Entering A1");
        a1 = q.nextInt();
        System.out.println("Entering A2");
        a2 = q.nextInt();
        System.out.println("Entering A3");
        a3 = q.nextInt();
        System.out.println("For A1");
        for (j = 1; j <= n; j++) {
            x = b + j * h;
            F = Math.sqrt(2 + Math.sin(a1 + x)) + Math.sqrt(2 - Math.cos(a1 + x));
            System.out.print(F + " ");
        }
        System.out.println();
        System.out.println("For A2");
        for (j = 1; j <= n; j++) {
            x = b + j * h;
            F = Math.sqrt(2 + Math.sin(a2 + x)) + Math.sqrt(2 - Math.cos(a2 + x));
            System.out.print(F + " ");
        }
        System.out.println();
        System.out.println("For A3");
        for (j = 1; j <= n; j++) {
            x = b + j * h;
            F = Math.sqrt(2 + Math.sin(a3 + x)) + Math.sqrt(2 - Math.cos(a3 + x));
            System.out.print(F + " ");
        }
    }
}
