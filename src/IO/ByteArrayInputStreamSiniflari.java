package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamSiniflari {
    public static void main(String[] args) {

        byte [] dizi={1,2,3,5,6,7,8};
        ByteArrayInputStream yeni =new ByteArrayInputStream(dizi);
        System.out.println("Kullanılabilen byte sayisi : " + yeni.available());

        int i=yeni.read();
        while ( i != -1){
            System.out.println(i);
            i =yeni.read();
        }

        try {
            yeni.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
