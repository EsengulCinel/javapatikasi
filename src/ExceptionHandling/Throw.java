package ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
           // throw new Exception("yasiniz tutmuyor");
            throw new AgeCheckException("hata yakalandi");
        }
        System.out.println("yasi uygun");
    }

    public static void main(String[] args) throws AgeCheckException {

        Scanner input = new Scanner(System.in);
        System.out.println("yas girin");
        int age = input.nextInt();

//        try {
//            checkAge(age);
//
//        }catch (Exception e){
//            System.out.println("yas uymadi!!");
//        }

        checkAge(age);
        System.out.println("program bitti !!  ");
    }
}
