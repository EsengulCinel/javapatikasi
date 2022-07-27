package Giris;
import java.util.Scanner;
public class BoyKiloEndeksi {
    public static void main(String[] args) {
        int kilo;
        double boy,endex;
        Scanner input=new Scanner(System.in);
        System.out.println("kilo: ");
        kilo=input.nextInt();
        System.out.println("boy: ");
        boy= input.nextDouble();
        endex=kilo/(boy*boy);
        System.out.println("endex:"+endex);
    }

}
