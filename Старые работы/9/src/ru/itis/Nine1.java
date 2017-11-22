package ru.itis;
import java.util.Scanner;
public class Nine1 {//          9А ДОМАШНЯЯ РАБОТА
        public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int m , n;
        double Sum = 0 , z, k = 1;
        System.out.println("Entering n");
        n = a.nextInt();
            for ( m = 1; m <= n; m++){
                z = k / (m * m);
                k = -k;
                Sum = Sum + z;
            }
        System.out.println(Sum);
        }
}