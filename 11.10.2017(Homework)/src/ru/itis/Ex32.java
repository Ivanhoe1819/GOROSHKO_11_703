package ru.itis;

import java.util.Scanner;

public class Ex32 {// Б

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        double x0, x1, eps = 0.0001, a;
        int n = 0;
        System.out.println("Entering a");
        a = q.nextDouble();
        x0 = a;
        x1 = 1 + 9 * Math.sin(x0) / 2;
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            x1 = 1 + 9 * Math.sin(x0) / 2;
            n++;
        }
        System.out.println(x0);
    }
}