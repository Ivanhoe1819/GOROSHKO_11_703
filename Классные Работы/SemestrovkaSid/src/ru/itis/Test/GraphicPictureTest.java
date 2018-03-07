package ru.itis.Test;

import org.junit.Assert;
import ru.itis.Figure;
import ru.itis.GraphicPic;
import ru.itis.GraphicPicture;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class GraphicPictureTest {

    @org.junit.Test
    public void show() throws Exception {
        File templ = new File("C:\\Users\\Ivan\\Desktop\\GOROSHKO_11_703\\Классные Работы\\SemestrovkaSid\\src\\TestOutput");
        long size = Files.size(Paths.get("C:\\Users\\Ivan\\Desktop\\GOROSHKO_11_703\\Классные Работы\\SemestrovkaSid\\src\\TestOutput"));
        FileOutputStream out = new FileOutputStream("C:\\Users\\Ivan\\Desktop\\GOROSHKO_11_703\\Классные Работы\\SemestrovkaSid\\src\\TestOutput");
        PrintStream prnt = new PrintStream(out);
        System.setOut(prnt);
        GraphicPic gra = new GraphicPicture("Figure.txt");
        gra.show();
        prnt.close();
        out.close();
        Assert.assertNotEquals(size, Files.size(Paths.get("C:\\Users\\Ivan\\Desktop\\GOROSHKO_11_703\\Классные Работы\\SemestrovkaSid\\src\\TestOutput")));
        // TODO LISTs compare
    }

    @org.junit.Test
    public void insert() throws Exception {
        GraphicPicture konekochan = new GraphicPicture("Figure.txt");
        int suza = konekochan.getSize();
        konekochan.insert(new Figure("line", 4, 5, 17, 1, 19));
        Assert.assertNotEquals(suza, konekochan.getSize());
    }

    @org.junit.Test
    public void delete() throws Exception {
        GraphicPicture konekochan = new GraphicPicture("Figure.txt");
        int suza = konekochan.getSize();
        konekochan.delete("line");
        Assert.assertNotEquals(suza, konekochan.getSize());
    }

    @org.junit.Test
    public void commonWith() throws Exception {
        GraphicPicture nekochan = new GraphicPicture("Figure.txt");
        GraphicPic stl = nekochan.commonWith(new Figure("rectangle", 20, 20, 8, 3, 12));
        Assert.assertEquals(stl.getSize(),0);
    }

    @org.junit.Test
    public void hasSquareBuggerThanS() throws Exception {
        GraphicPicture kochan = new GraphicPicture("Figure.txt");
        GraphicPic templ = kochan.hasSquareBuggerThanS(10000);
        Assert.assertEquals(0, templ.getSize());
    }

}