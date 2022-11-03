package WORKS;

import java.util.*;

public abstract class Account implements Comparable<Account> {
    //  müşteri bilgilerini ekrana yazdıran "final" tipinde,
    //  değer döndürmeyen ve ismi "showUserInfo" bir fonksiyon tanımlayınız.

    //liste halinde saklanacak

    //login
    //enum succcess fail try catch

    enum AuthenticationStatus {SUCCESS,FAIL}
    private AuthenticationStatus status;
    private User users;


    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public final void showUserInfo() {
        System.out.println("Musteri bilgileri ----------- !" +
                "Isim: " + users.getIsim() +
                "Soyisim:" + users.getSoyisim() +
                "E-posta: " + users.getEmail() +
                "Meslek:" + users.getMeslek() +
                "Yas:" + users.getYas() +
                "Son giris: " + users.getSistemeSonGirisTarihi()
        );
    }

    public void Login(String email,String sifre) throws Insurance.InvalidAuthenticationException {
            if (email.equals(users.getEmail()) && sifre.equals(users.getSifre())){
                setStatus(AuthenticationStatus.SUCCESS);
                System.out.println("giris basarili !! :) ");
            }else {
                setStatus(AuthenticationStatus.FAIL);
                System.out.println("giris basarisiz !! :( ");
                throw new Insurance.InvalidAuthenticationException("Kullanici bilgileri hatali !!");
            }
    }

}
