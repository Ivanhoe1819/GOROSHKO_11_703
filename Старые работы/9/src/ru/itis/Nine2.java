package ru.itis;
import java.util.Scanner;
public class Nine2 {//          9Б ДОМАШНЯЯ РАБОТА
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        double Sum = 0.5 , z = 0.5 , m;
        System.out.println("Entering n");
        n = a.nextInt();
        for ( m = 2; m <= n; m++){
            z = z * ( ( m - 1) * (m - 1) / ( ( 2 * m - 1) * 2 * m) );
            System.out.println(z);
            Sum = Sum + z;
        }
        System.out.println(Sum);
    }
}