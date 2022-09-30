package Giris;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DiziSirala {
    public static void main(String[] args) {

        ArrayList<Dizi> diziler = new ArrayList<Dizi>();

        Dizi dizi1 = new Dizi(30, "a");
        Dizi dizi2 = new Dizi(20, "b");
        Dizi dizi3 = new Dizi(50, "c");

        diziler.add(dizi3);
        diziler.add(dizi1);
        diziler.add(dizi2);


        int max = diziler.get(0).getPage();

        for (int i = 1; i < diziler.size(); i++) {

            if (diziler.get(i).getPage() > max) {

                max = diziler.get(i).getPage();


            }
        }
        System.out.println(max);

    }
}
