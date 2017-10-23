package ru.itis;

import java.util.Scanner;

public class Ex24_A { // A
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int k = 2;
        double Sum, b0 = 1, c0 = 0, b1, a, c1, bk, ck, m, x, t = 1, eps = 0.0001;
        System.out.println("Entering X");
        x = q.nextDouble();
        System.out.println("Entering M");
        m = q.nextDouble();
        b1 = Math.cos(x);
        c1 = Math.sin(x);
        bk = b0 * b1 - c0 * c1;
        ck = c0 * b1 + c1 * b0;
        t = t / k;
        Sum = b1 / 1;
        a = bk * t;
        while (k <= m && Math.abs(a) >= eps) {
            Sum = Sum + a;
            b0 = b1;
            c0 = c1;
            b1 = bk;
            c1 = ck;
            bk = b0 * b1 - c0 * c1;
            ck = c0 * b1 + c1 * b0;
            k++;
            t = t / k;
            a = bk * t;
        }
        System.out.println(Sum);
        System.out.println(k);
    }
}