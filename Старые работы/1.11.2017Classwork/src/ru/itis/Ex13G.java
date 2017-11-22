package ru.itis;

import java.util.Scanner;

public class Ex13G {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, k = 1, c = 0;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        int[] v = new int[n];
        System.out.println("Entering Mass");
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();
        }
        for (int i = 0; i < n; i++) {
            v[i] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                k++; }
                else  { //почему независимая проверка?
                v[c] = k;
                k = 1;
                c++;
            }
        }   //чему еще может равняться i, если у вас закончился цикл?
        v[c] = k;
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
