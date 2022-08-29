package SerializationVS;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Buffered {
    public static void main(String[] args) {
        try {
            FileInputStream input=new FileInputStream("patika.txt");
            BufferedInputStream buffInp=new BufferedInputStream(input);

            int i=buffInp.read();
            while (i != -1){
                System.out.print((char)i);
                i=buffInp.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
