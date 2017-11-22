package ru.itis;

import java.util.Scanner;

public class Ex13_E {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k = 0, g = 0;
        double c;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        c = a[0];
        for (int i = 1; i < n-1; i++) {
            if (a[i]!=a[i-1]&& a[i]!= a[i+1]){
                k++;
            }
        }
        if (a[n-1]!=a[n-2]){
            k++;
        }
        if (a[0]!=a[1]){
            k++;
        }
        System.out.println(k);
    }
}
