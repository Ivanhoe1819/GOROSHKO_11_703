package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner a = new Scanner(System.in);
                int z=1 , x , k , n, p;
                double Sum = 0,c;
                System.out.println("Input n");
                n=a.nextInt();
                System.out.println("Input x");
                x=a.nextInt();
                for (k=0; k <= n; k++){
                    c=Math.pow(x,(2*k+1));
                    for (p=1; p<=k; p++) {
                        z*=2*p;
                    }
                    if (k%2==0) {
                        Sum = Sum +((c)/(z*(4*k +1)));
                    }
                    else {
                        Sum = Sum +(((-1)*c)/(z*(4*k +1)));
                    }
                }
                System.out.println(Sum);
            }    }
