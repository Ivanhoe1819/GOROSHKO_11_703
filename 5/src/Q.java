public class Q {
    public static void main (String[]args){
        int  n = 2 , p=1;
        double Sum = 1 ;
        double Pi = 3.1415926 ;
        double eps = 0.0001 ;
        while ( Math.abs ( Sum - ( Pi / 4) ) > eps ) {
            Sum = Sum + ((-1.0)*p) /(2*n-1);
            p=-p;
            n++;
        }
        System.out.println(n-1);
    }
}
