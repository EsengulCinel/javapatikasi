package Giris;
import java.util.Scanner;
public class DairanınAlanıCevresi {
    public static void main(String[] args) {
        int r;
        double pi=3.14,alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.println("Yaricapi giriniz:");
        r=input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;





        System.out.println("alanı:"+alan);
        System.out.println("\ncevresi:"+cevre);

    }
}
