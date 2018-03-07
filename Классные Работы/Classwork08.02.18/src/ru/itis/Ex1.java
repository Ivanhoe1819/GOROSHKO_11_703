package ru.itis;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        function(n);
    }

    public static void function(int n) {
        int a[] = new int[10];
        int q=0;
        for (int i = 0; i < a.length && n>0 ; i++) {
            a[i] = n % 10;
            n = n / 10;
            System.out.print(a[i]);
        }
        for (int i = 0; i < a.length && a[i]!=0 ; i++){

        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]<a[j]){
                q = q+fact(n);
                }
            }
        }
        System.out.println(q);
    }
    public static int fact(int n) {
        if (n==0&&n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
