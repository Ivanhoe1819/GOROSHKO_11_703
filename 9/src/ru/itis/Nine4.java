package ru.itis;
import java.util.Scanner;
public class Nine4 {//          9Г ДОМАШНЯЯ РАБОТА
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        double Sum = 0 , z = 1, k = 1, m , p = 1;
        System.out.println("Entering n");
        n = a.nextInt();
        for ( m = 0; m <= n; m++){
            Sum = Sum + (1 / ((2 * m + 1)*p));
            p = p * 9;
        }
        System.out.println(Sum);
    }
}