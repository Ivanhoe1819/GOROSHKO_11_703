package ru.itis;

public class Re {
    public static void main(String[] args) {
        int k, j, l;
        int[] a = {3, 4, 5, 10, 11, 12, 13};
        int[] b = {1, 2, 6, 7, 8};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
        k = 0;
        j = 0;
        l = 0;
        while (k < a.length && j < b.length) ;
        if (a[k] < b[j]) {
            c[l] = a[k];
            k++;
        } else {
            c[l] = b[j];
            j++;
        }
        l++;
        if (k == a.length) {
            for (int i = j; i < b.length; i++) {
                c[l] = b[i];
                l++;
            }
        } else {
            for (int i = k; i < a.length; i++) {
                c[l] = a[i];
                l++;
            }
        }
        for (int i = k; i < c.length; i++) {
            System.out.println(c[l]);
        }
    }
}  n