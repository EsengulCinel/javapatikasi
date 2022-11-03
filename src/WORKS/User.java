package WORKS;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String isim;
    private String soyisim;
    private String email;
    private String sifre;
    private String meslek;
    private int yas;

    private Date sistemeSonGirisTarihi;

    private ArrayList<Address> address;

    public User(String isim, String soyisim, String email, String sifre, String meslek, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;

        this.address=new ArrayList<>();
    }

    public String getIsim(){
        return isim;
    }

    public  void setIsim(String isim){
        this.isim=isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Date getSistemeSonGirisTarihi() {
        return sistemeSonGirisTarihi;
    }

    public void setSistemeSonGirisTarihi(Date sistemeSonGirisTarihi) {
        this.sistemeSonGirisTarihi = sistemeSonGirisTarihi;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }

    //hash code ve equals burada yapmış ama neden? en son bakalım
}
