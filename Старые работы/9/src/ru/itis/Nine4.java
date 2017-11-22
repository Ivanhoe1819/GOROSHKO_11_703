package ru.itis;

import java.util.Scanner;

public class Nine4 {//          9Г ДОМАШНЯЯ РАБОТА

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        double Sum = 0, m, p = 1;
        System.out.println("Entering n");
        n = a.nextInt();
        for (m = 0; m <= n; m++) {
            Sum = Sum + p;
            p = p*(2 * m - 1) / ((2 * m + 1) * 9);
        }
        System.out.println(Sum);
    }
}