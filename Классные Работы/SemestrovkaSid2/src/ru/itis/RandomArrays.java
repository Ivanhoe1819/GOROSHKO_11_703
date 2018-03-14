package ru.itis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomArrays {
    Random r = new Random();
    int[][] arrays = new int[r.nextInt(50)+50][];

    public int [][] create() {
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int[r.nextInt(9900) + 100];
            for (int k = 0; k < arrays[i].length; k++) {
                arrays[i][k] = r.nextInt();
            }
        }
        return arrays;
    }

    public void kochan(int[][] arrays) throws IOException {
        File file = new File("C:\\Users\\Ivan\\Desktop\\GOROSHKO_11_703\\Классные Работы\\SemestrovkaSid2\\src\\ru\\itis\\MyFile");
        FileWriter zapis = new FileWriter(file);
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                zapis.write(arrays[i][j] + " ");
            }
            zapis.write("hui"+arrays[i].length);
            zapis.write("\n");
        }
        zapis.close();
    }
}