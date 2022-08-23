package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Cekilecek tutar girin :");
        double price = input.nextDouble();

        System.out.print("Kart no girin :");
        String cardNumber = input.next();


        System.out.print("Son kullanim tarihi girin :");
        String expiryDate = input.next();


        System.out.print("Guvenlik kodu girin :");
        String cvc = input.next();


        System.out.println("1. A bankasi");
        System.out.println("2. B bankasi");
        System.out.println("C. C bankasi");
        System.out.print("Banka secin");
        int selectBank = input.nextInt();
        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A bankasi", "239012", "2042");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B bankasi", "239012", "2042");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,expiryDate,cvc);
            default:
                System.out.println("gecerli bir banka giriniz !!");
        }


    }
}
