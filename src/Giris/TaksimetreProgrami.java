package Giris;
import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {
        double km,tutar;
        int acilis=10;
        Scanner input=new Scanner(System.in);
        System.out.println("km giriniz:");
        km=input.nextInt();

        tutar=(km*2.20)+10;
        if (tutar<=20){
            System.out.println("Odemeniz:20 tl");
        }
        else

            System.out.println("Odemeniz:"+tutar);


    }
}
