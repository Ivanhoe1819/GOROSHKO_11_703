package ru.itis;//-
/* алгоритм должен быть посторен на программировании кванторной формулы
   этот решает неверно, см. пример внизу */

import java.util.Random;
import java.util.Scanner;

public class Ex22D {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n, t = 0;
        System.out.println("Entering N");
        n = q.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Random r = new Random();   //прописные буквы только у имени класса и у констант
        for (int i = 0; i < n; i++) {
            a[i] = q.nextInt();//r.nextInt(50);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            boolean e = true;
            for (int k = 0; k < n; k++) {
                if (a[i] == a[k] && i != k && a[i] != b[k] && e) {
                    b[i] = a[i];
                    e = false;
                }
            }
            if (e) {
                t++;
            }
        }
        t = n - t;
        System.out.println(t);
    }
}
//6 9 7 0 1 4 8 0 2 9 1 0 3 4 7 
//1
