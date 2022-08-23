package KalitimInheritence;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getadSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + "Universiye giris yapti");
    }

    public void cikis() {
        System.out.println(this.adSoyad + "Universiden cikis yapti  ");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + "Yemekhaneye giris yapti");
    }

    //polymorphism
    public static void girisYapanlar(Calisan[] logins) {
        for (Calisan c : logins) {
            c.giris();

        }
    }
}
