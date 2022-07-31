package Giris;
import  java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int deger;
        int sonuc=0;
        System.out.print("Bir deger girin : ");
        deger=input.nextInt();
        for (int i=0; i<=deger;i++){
            if(i%2==0){
                sonuc +=i;
                //System.out.println("cift sayilar :" + i);


            }
        }
        System.out.println("cift sayi toplami :" + sonuc);
    }
}
