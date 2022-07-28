package Giris;
import java.util.Scanner;
public class SınıfGecme {
    public static void main(String[] args) {
        int m,f,t,k,r,ort;
        Scanner inp=new Scanner(System.in);
        System.out.println("Matematik, Fizik, Türkçe, Kimya, Müzik notlarinizi girin:");

        m=inp.nextInt();
        f=inp.nextInt();
        t=inp.nextInt();
        k=inp.nextInt();
        r=inp.nextInt();
        if ((m <0 || f <0 || t<0 || k<0 ||r<0) && (m >100 || f >100 || t>100 || k>100 ||r>100) ){

            System.out.println("0 ve 100 arası deger girin");
        }else {
            ort=(m+f+t+k+r)/5;
            System.out.println(ort);

        }



    }


}
