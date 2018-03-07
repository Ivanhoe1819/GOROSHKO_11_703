package ru.itis;

import java.util.Scanner;

public class Perestanovki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        System.out.println(Count(toArr(num)));
        //4627
    }
    public static int Count(int[] num) {
        int i = 0;
        for (int g = 0; g < num.length; g++) {
            for (int k = g; k < num.length; k++) {
                if (num[g] < num[k]) {
                    i += fact(num.length - g - 1);
                }
            }
        }
        return i;
    }

    public static int[] toArr(String n) {
        char[] num = n.toCharArray();
        int[] i = new int[num.length];
        for (int g = 0; g < num.length; g++) {
            i[g] = num[g] - '0';
        }
        return i;
    }
    public static long fact(int n) {
        if (n == 0) return 1;
        return n * (fact(n - 1));
    }




}