package ru.itis;

import java.util.Scanner;

public class Ex13_J {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        int[] w = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if (a[i]!=a[i-1]&& a[i]!= a[i+1]){
               w[i]=a[i];
            }
            else{
                w[i]=0;
            }
        }
        if (a[n-1]!=a[n-2]){
            w[n-1]=a[n-1];
        }
        else{
            w[n-1]=0;
        }
        if (a[0]!=a[1]){
            w[0]=a[0];
        }
        else {
            w[0]=0;
        }
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.print(w[i]+" ");
        }
    }
}
