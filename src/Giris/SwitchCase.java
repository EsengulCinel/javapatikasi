package Giris;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int giris, deger1, deger2, sonuc;
        Scanner intput = new Scanner(System.in);
        System.out.print("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bölme\nDeger girin:");
        giris = intput.nextInt();
        System.out.println("iki değer girin:");
        deger1 = intput.nextInt();
        deger2 = intput.nextInt();

        switch (giris) {

            case 1:
                sonuc = deger1 + deger2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = deger1 - deger2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = deger1 * deger2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = deger1 / deger2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("sacmalama istersen");
        }
    }


}
