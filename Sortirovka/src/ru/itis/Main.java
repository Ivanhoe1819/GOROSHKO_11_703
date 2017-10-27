package ru.itis;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter n=");
        Scanner sc = new Scanner(System.in);
        int n, t = 5;
        n = sc.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++)
        {
            a[i] = r.nextInt(100);
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + ", ");
        }    }
}
