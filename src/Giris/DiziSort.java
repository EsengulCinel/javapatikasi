package Giris;
import java.util.Scanner;
import java.util.Arrays;
public class DiziSort {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut= inp.nextInt();

        int[] list=new int[boyut];

        for (int i =0;i<list.length;i++){
            System.out.print("Dizinin "+(i+1)+".elamani :");
            list[i]=inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
