package ru.itis;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = 0, p = 1, x;
        double t, S = 0;
        System.out.println("Entering X");
        x = q.nextInt();
        while (x >= 1) {
            t = x % 10;
            System.out.println(t);
            x = x / 10;
            System.out.println(x);
            S = S + p * t;
            System.out.println(S);
            n++;
            System.out.println(n);
            p = -p;
        }
        System.out.println(S);
    }
}
