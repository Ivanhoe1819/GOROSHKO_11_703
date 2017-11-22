package ru.itis;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        double a0, b0, an, bn, eps = 0.0001, x;
        int k=1;
        System.out.println("Entering x");
        x = q.nextDouble();
        a0 = x;
        b0 = 1 - x;
        bn = b0 * b0 * (3 + b0);
        an = a0 * (1 + (b0) / 2);
        while (bn > eps) {
            an = a0 * (1 + (b0) / 2);
            bn = b0 * b0 * (3 + b0);
            b0=bn;
            a0=an;
            k++;
        }
        System.out.println(an);
    }
}