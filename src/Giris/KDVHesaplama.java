package Giris;
import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        int a;
        float kdv,tutar;
        Scanner input=new Scanner(System.in);
        System.out.println("para degeri girin:");
        a= input.nextInt();
        kdv=((a*18)/100f)+a;
        tutar=kdv-a;
        System.out.println("kdv'siz fiyat: "+a);
        System.out.println("kdv'li fiyat: "+kdv);
        System.out.println("kdv tutari: "+tutar);

    }

}
