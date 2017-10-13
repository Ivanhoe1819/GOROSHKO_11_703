import java.util.Scanner; //12 Г
public class TwelveD {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int n=1;
        double eps = 0.0001;
        double G = 0 , t=1, m=1, x;
        System.out.println("Entering x");
        x = a.nextInt();
        while (Math.abs(t)>eps){
            G = G + t;
            t = t*(-1)*m/(2*n);
            m = m*x*x;
            n++;
            System.out.println(n);
        }
        System.out.println(G);
    }
}