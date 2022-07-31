package Giris;
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int fakSayi;
        int sonuc=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayi: ");
        fakSayi=input.nextInt();

        for(int i=1;i<=fakSayi;i++){
            sonuc *=i;
        }
        System.out.println(sonuc);
    }
}
