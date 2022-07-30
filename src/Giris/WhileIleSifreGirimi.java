package Giris;
import java.util.Scanner;

public class WhileIleSifreGirimi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int pass;
        boolean isPasswordSucess=false;


        while (!isPasswordSucess){
            System.out.println("sifre girin");
            pass=inp.nextInt();
            if (pass == 123){
                System.out.println("dogru");
                isPasswordSucess=true;
            }
            else {
                System.out.println("yanlis");
            }

        }

    }

}
