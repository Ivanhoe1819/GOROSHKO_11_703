package ru.itis;

import java.util.Scanner;

public class Ex13_A {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k = 1;
        double c;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        c = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i]!=c){
                c=a[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
