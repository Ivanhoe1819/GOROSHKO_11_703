import java.util.Scanner; //12 А
public class TwelveA {
    public static void main(String[]args){
    Scanner a = new Scanner(System.in);
    int n=1 , p=1, l;
    double eps = 0.0001;
    double G = 0 , t=1, m=1, x;
    System.out.println("Entering x");
    x = a.nextDouble();
    while (Math.abs(t)>eps){
        G = G + t;
        t = t * (x/n);
        n++;
        System.out.println(n);
    }
    System.out.println(G);
    }
}