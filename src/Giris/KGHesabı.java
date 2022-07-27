package Giris;
import java.util.Scanner;
public class KGHesabı {
    public static void main(String[] args) {
        int a,b,c,d,e;
        double x=2.14, y=3.67,z=1.11,w=0.95,k=5.00,toplam;
        Scanner inp=new Scanner(System.in);
        System.out.println("kacar kilo:");
        a= inp.nextInt();
        b=inp.nextInt();
        c=inp.nextInt();
        d=inp.nextInt();
        e=inp.nextInt();
        toplam=(a*x)+(b*y)+(c*z)+(d*w)+(e*k);
        System.out.println(toplam);


    }
}
