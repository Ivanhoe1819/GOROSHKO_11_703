package ru.itis;
import java.util.Scanner;
//10a
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
                c=Math.pow(x,(2*k+1));   //плохо: 1) не используете результат подсчета на предыдущем шаге
                                                //  2) получите преполнение
                for (p=1; p<=k; p++) {  //плохо: 1) не используете результат подсчета на предыдущем шаге
                                                //  2) получите преполнение
                    z*=p;          
                }
                if (k%2==0) {
                    Sum = Sum +((c)/(z*(2*k +1)));
                }
                else {
                    Sum = Sum +(((-1)*c)/(z*(2*k +1)));//странно вычитаете
                }
            }
            System.out.println(Sum);
        }
}
