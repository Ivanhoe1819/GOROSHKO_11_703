package ru.itis;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        boolean f = false;
        int n = a.length();
        int m = b.length();
        if (n == m) {
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == b.charAt(i)) {
                } else {
                    System.out.println(f);
                    return;
                }
            }
        } else {
            System.out.println(f);
            return;
        }
        f = true;
        System.out.println(f);
    }
}
