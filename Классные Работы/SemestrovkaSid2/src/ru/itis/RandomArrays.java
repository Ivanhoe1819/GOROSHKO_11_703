package ru.itis;

import java.util.Random;

public class RandomArrays {
    Random r = new Random();
    int[][]massivs = new int[100][];
    public void create() {
        for(int i = 0;i<=massivs.length;i++){
            int [] q = new int[r.nextInt(9900)+100];
            for(int k = 0; k<q.length;k++){
                massivs[i][k] = r.nextInt();
            }
        }
    }
    public void show(int[][]massivs){
        for (int i = 0; i<massivs.length;i++){

        }
    }
}
