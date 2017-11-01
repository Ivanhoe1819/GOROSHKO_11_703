package ru.itis;

import java.util.Scanner;

public class Ex22V {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        System.out.print("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }

        System.out.println();
        boolean f0 = true;
        boolean f1 = true;
        for (int i = 0; i < n-1; i++) {
            if (a[i] >= a[i + 1]) {

                f0 = false;
            }
            if (a[i] <= a[i + 1]) {

                f1 = false;
            }
        }
        if (!f0&&!f1){
            System.out.println("Не отсортирован");
        }
        if (!f0&&f1) {
            System.out.println("Убывает");
        }
        if (!f1&&f0) {
            System.out.println("Возрастает");
        }
    }
}