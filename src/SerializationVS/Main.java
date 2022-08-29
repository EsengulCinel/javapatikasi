package SerializationVS;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes", "E5");

        try {
            FileOutputStream outputfile=new FileOutputStream("araba.txt");
            ObjectOutputStream output =new ObjectOutputStream(outputfile); //output'un nereye çıktı verdiğini söylüyor
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
