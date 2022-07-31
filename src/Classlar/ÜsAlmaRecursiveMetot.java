package Classlar;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ÜsAlmaRecursiveMetot {

    static int usAlma(int taban, int tavan){
       // int sonuc=1;
        int sonuc;
       sonuc= (int) pow(taban,tavan);
//        for(int i =1;i<=tavan;i++){
//            sonuc *=taban;
//        }
        return sonuc;
    }


    public static void main(String[] args) {
        int taban,tavan;
        Scanner inp=new Scanner(System.in);
        System.out.println("taban ve tavan degerlerini girin: ");
        taban=inp.nextInt();
        tavan=inp.nextInt();
       System.out.println("sonuc: "+usAlma(taban,tavan));


    }
}
