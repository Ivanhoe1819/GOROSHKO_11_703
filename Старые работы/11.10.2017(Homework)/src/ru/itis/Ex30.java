package ru.itis;

import java.util.Scanner;

public class Ex30 {//A

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        double x0 = 0, x1, eps = 0.0001, f, f1;
        int n = 1;
        System.out.println("Entering x0");
        x0 = q.nextDouble();
        f = 2 * Math.sin(x0 / 2) - x0;
        f1 = 2 * Math.cos(x0 / 2) - 1;
        x1 = x0 - f / f1;
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            f = 2 * Math.sin(x0 / 2) - x0;
            f1 = 2 * Math.cos(x0 / 2);
            x1 = x0 - f / f1;
            n++;
        }
        System.out.println(x1);
    }
}