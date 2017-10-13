import java.util.Scanner;// 12 В
public class Main {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int n=1,p=1;
        double x;
        double eps = 0.0001;
        double G = 0 , t=1;
        System.out.println("Entering x");
        x = a.nextDouble();
        while (Math.abs(t)>eps) {
            G = G+(t/n);
            t = t*p*x;
            p = -p;
            n++;
        }
        System.out.println(G);
    }
}