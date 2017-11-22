package ru.itis;
import java.util.Scanner;
//10a
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x , k , n, p;
        double Sum = 0, z=1,c=1;
        System.out.println("Input n");
        n=a.nextInt();
        System.out.println("Input x");
        x=a.nextInt();
        p = x;
        for (k=0; k <= n; k++) {
            if (k == 0) {
                z = x;
            }
            else {
                c = c*(-p)/k;
                z = z*c/(2*k+1);
            }
            p = p*x*x;
            Sum = Sum + z;
        }
        System.out.println(Sum);
    }
}