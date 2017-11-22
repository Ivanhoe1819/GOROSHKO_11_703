package ru.itis;

import java.util.Scanner;

public class Ex30home {//Б

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        double x0, x1, eps = 0.0001, f, f1;
        int n = 1;
        System.out.println("Entering x0");
        x0 = q.nextDouble();
        f = x0 * x0 * x0 * x0 * x0 - x0 - 0.002;
        f1 = 4 * x0 * x0 * x0 * x0 - 1;
        x1 = x0 - f / f1;
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            f = x0 * x0 * x0 * x0 * x0 - x0 - 0.002;
            f1 = 4 * x0 * x0 * x0 * x0 - 1;
            x1 = x0 - f / f1;
            n++;
        }
        System.out.println(x1);
    }
}