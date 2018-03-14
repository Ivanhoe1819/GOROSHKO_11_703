package ru.itis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws Exception {
        RandomArrays nekochan = new RandomArrays();
        nekochan.kochan(nekochan.create());
    }
}
