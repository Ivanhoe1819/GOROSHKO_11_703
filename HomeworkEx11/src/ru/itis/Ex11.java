package ru.itis;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        double Sum = 0, q = 1, i;
        System.out.println("Entering N");
        n = a.nextInt();
        for (i = 0; i <= n; i++) {
            q = q * Math.cos(i) / Math.sin(i);
            Sum = Sum + q;
        }
        System.out.println(Sum);
    }
}