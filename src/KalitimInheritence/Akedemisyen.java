package KalitimInheritence;

public class Akedemisyen extends Calisan {
    private String bolum;
    private String unvan;

    Akedemisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;


    }

    public String getBolum() {
        return this.bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return this.unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void dersegir() {
        System.out.println(this.getadSoyad() + "derse giris yapti");
    }

    @Override
    public void giris() {
        System.out.println(this.getadSoyad() + "akedemisyon A kapisindan giris yapti ");
    }
}
