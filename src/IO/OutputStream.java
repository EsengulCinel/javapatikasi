package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        String yazi = "OutputStreamOgreniyorum  \n PatikaDev";
        try {

            File dosya = new File("patika.txt");
            FileOutputStream output = new FileOutputStream(dosya, true);
            byte[] YaziByte = yazi.getBytes();      //bu metot string'in içindeki verileri byte halinde geriye array döndürüyor.
            output.write(YaziByte);
            output.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
