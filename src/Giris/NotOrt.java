package Giris;
import java.util.Scanner;
public class NotOrt {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        float ort;

        Scanner input=new Scanner(System.in);

        System.out.println("matematik notunuzu girin:");
        matematik=input.nextInt();


        System.out.println("fizik notunuzu girin:");
        fizik=input.nextInt();


        System.out.println("kimya notunuzu girin:");
        kimya=input.nextInt();


        System.out.println("turkce notunuzu girin:");
        turkce=input.nextInt();


        System.out.println("tarih notunuzu girin:");
        tarih=input.nextInt();


        System.out.println("muzik notunuzu girin:");
        muzik=input.nextInt();

         ort=((matematik+fizik+kimya+turkce+tarih+muzik)/6f);
        System.out.println("ortalaman :" +ort);
    }
}
