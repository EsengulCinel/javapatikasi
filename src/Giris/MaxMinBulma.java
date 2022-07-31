package Giris;

import java.util.Scanner;

public class MaxMinBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kac, sayi;
        int max = 1;
        int min = 1;
        boolean isSayi = false;
        System.out.print("Kac tane deger gireceksiniz :");
        kac = input.nextInt();
        for (int i = 1; i <= kac; i++) {
            System.out.print("sayi girin: ");
            sayi = input.nextInt();
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("max sayi: " + max);
        System.out.println("min sayi :" + min);

    }
}

