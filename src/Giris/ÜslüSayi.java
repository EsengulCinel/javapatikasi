package Giris;
import java.util.Scanner;
public class ÜslüSayi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int üs, sayi;
        int sonuc=1;
        System.out.print("USSU girin :");
        üs=input.nextInt();
        System.out.print("Sayiyi girin: ");
        sayi=input.nextInt();

        for (int i=1;i<=üs;i++){
            sonuc *=sayi;

        }
        System.out.println(sonuc);
    }
}
