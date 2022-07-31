package Classlar;
import java.util.Scanner;
public class Metotlar {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
//            System.out.println("*********");
//            System.out.println("sayi: "+temp);
            lastNumber = temp % 10;
            //    System.out.println("son basamak : "+lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //      System.out.println("yeni sayi: "+reverseNumber);
            temp /= 10;
        }
        if (number==reverseNumber){
            return true;

        }else
            return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner inp =new Scanner(System.in);
        System.out.println("sayi girin: ");
        number=inp.nextInt();
        System.out.println(isPalindrom(number));

    }

}
