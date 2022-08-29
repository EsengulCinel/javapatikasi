package IO;

import java.io.File;
import java.io.IOException;

public class FileSinifleri {
    public static void main(String[] args) {
        //olmayan bir dosya yolunu oluştururken

        File dizin =new File("test");
        dizin.mkdir();

        File dizin2=new File("patika/dev");
        dizin2.mkdirs();


        File dosya = new File("test/java.txt");  // src/java2.txt gibi de path verebilirsin



        try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + "dosyasi olusturuldu");
            } else {
                System.out.println(dosya.getName() + "dosyasi zaten mevcut");
            }
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }


        //Dosyaların içinde ne var ne yok listeleyip böyle bakabiliriz.
        String[] liste=dizin.list();
        for (String i:liste){
            System.out.println(i);

        }

      //   dosya.delete(); //diyerek silebiliriz.
    }
}
