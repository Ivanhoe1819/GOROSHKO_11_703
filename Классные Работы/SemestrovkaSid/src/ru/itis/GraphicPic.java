package ru.itis;

public interface GraphicPic {
    void show();
    void insert(Figure f);
    void delete(String i);
    GraphicPic commonWith (Figure f);
    GraphicPic hasSquareBuggerThanS(double s);
    public int getSize();
}

