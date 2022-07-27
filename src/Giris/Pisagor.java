package Giris;
import java.util.Scanner;
public class Pisagor {
    public static void main(String[] args) {
        double a,b,c;
    Scanner input=new Scanner(System.in);
        System.out.println("A sayisini girin");
    a= input.nextInt();
        System.out.println("B sayisini girin");
    b= input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenus:"+c);
    }
}
