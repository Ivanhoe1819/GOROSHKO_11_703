package ru.itis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ivan\\Desktop\\GOROSHKO_11_703\\Классные Работы\\SemestrovkaSid2\\src\\ru\\itis\\MyFile");
        RandomArrays nekochan = new RandomArrays();
        FileWriter zapis = null;
        try {
            zapis = new FileWriter(file);
            nekochan.create();
        }catch(IOException e){
        }

    }
}
