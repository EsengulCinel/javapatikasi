package Giris;

import java.util.Scanner;

public class SifreOlusturma {
    public static void main(String[] args) {
        String username, password, newPass, giris;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adinizi girin:");
        username = input.nextLine();
        System.out.println("Sifrenizi girin:");
        password = input.nextLine();

        if (username.equals("patika") && (password.equals("Java123"))) {
            System.out.println("giris basarılı");
        } else {
            System.out.println("Sifrenizi sifirilamak ister misiniz?Evet için 1 Hayır için 2:");
            giris = input.nextLine();
            if (giris.equals("1")) {
                System.out.println("Yeni sifrenizi girin:");
                newPass = input.nextLine();
                    if (newPass.equals("Java123")) {
                        System.out.println("Yeni sifre eskisiyle ayni olamaz");
                    }
                    else {
                        System.out.println("sifre olusturuldu");
                    }
            } else if (giris.equals("2")) {
                System.out.println("olusturmadık");
            }
        }
    }
}
