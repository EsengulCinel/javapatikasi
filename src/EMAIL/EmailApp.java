package EMAIL;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        Scanner ad=new Scanner(System.in);
        System.out.println("Enter name and surname: ");
        String a=ad.nextLine();
        String b=ad.nextLine();

        Email em1=new Email(a,b);

        em1.showInfo();
    }


}
