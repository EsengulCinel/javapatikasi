package Giris;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int gun, ay;
        String burc = null;
        boolean isError = false;

        System.out.println("dogdugunuz ayi girin:");
        ay = inp.nextInt();
        System.out.println("dogdugunuz gunu girin:");
        gun = inp.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "oglak";

                    } else {
                        burc = "Kova";
                    }

                } else {
                    isError = true;
                }


                break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("hatali giriş");

        } else {
            System.out.println("burcunuz :" + burc);
        }


    }

}
