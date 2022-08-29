package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {
    public static void main(String[] args) {

        try {

            // File dosya=new File("patika.txt"); dosya'yı altta direkt vererek de yapabilirdik. iki yol var.

            // File dizin = new File("java102.txt");
            //dizin.createNewFile();


            FileInputStream input = new FileInputStream("patika.txt");

            //read metotu var olanı byte olarak okuyor sonrakine geçiyor.


            int i = input.read();
            while (i != -1) {                   // -1  daha okunacak veri kaldığında basılır. bunu bildiğimiz için döngüyü böyle kurduk
                System.out.print((char) i);         // okunnan sayısal byte değerlerini burada karaktere çevirdik.
                i=input.read();

            }
            input.close();  //kapatmazsak hafızada yer kaplar. kapat bre susak :D

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
