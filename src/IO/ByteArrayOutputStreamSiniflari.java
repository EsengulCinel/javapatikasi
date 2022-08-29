package IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamSiniflari {
    public static void main(String[] args) {

        String data = "Java102";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByte= data.getBytes();

        try {
            output.write(dataByte);

            String newData=output.toString(); //örneğin burada tekrar geri cevirebiliriz.
            System.out.println("Cikis akisi : " + newData);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
