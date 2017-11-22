import java.util.Scanner;// 12 Б
public class TwelveB {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int n=1, p = 1;
        double eps = 0.0001;
        double G = 0 , t, x;
        System.out.println("Entering x");
        x = a.nextDouble();
        t=x;
        while (Math.abs(t)>eps){
            t = t * -p * x * x / (2 * n + 1);
            G = G + t;
            p = -p;
            System.out.println(n);
            System.out.println(G);
            n++;
            System.out.println(n);
        }
        System.out.println(G);
    }
}