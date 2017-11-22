package ru.itis;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = 1;
        double a0 = 1, b0, a1, b1, x, eps = 0.0001;
        System.out.println("Entering x");
        x = q.nextDouble();
        b0 = 1 - x;
        b1 = b0 * b0;
        a1 = a0 * (1 + b0);
        while (b1 > eps) {
            a0 = a1;
            b0 = b1;
            a1 = a0 * (1 + b0);
            b1 = b0 * b0;
            n++;
        }
        System.out.println(a1);
    }
}
