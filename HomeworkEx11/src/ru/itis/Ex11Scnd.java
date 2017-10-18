package ru.itis;

import java.util.Scanner;

public class Ex11Scnd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        double v = 1, q = 1, i;
        System.out.println("Entering N");
        n = a.nextInt();
        for (i = 1; i <= n; i++) {
            q = q * Math.sin(i) / Math.cos(i);
            v = v * q;
        }
        System.out.println(v);
    }
}