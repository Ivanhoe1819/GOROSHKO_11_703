package ru.itis;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GraphicPicture nelepost = new GraphicPicture("Figure.txt");
        //nelepost.show();
//        nelepost.insert(new Figure("line", 4, 5, 17, 1, 19));
//        nelepost.insert(new Figure("circle", 4, 4, 8, 3, 11));
      //nelepost.delete("line");
        nelepost.show();
        //nelepost.commonWith(new Figure("rectangle", 5, 5, 8, 3, 12)).show();
       // nelepost.hasSquareBuggerThanS(12).show();
    }
}
