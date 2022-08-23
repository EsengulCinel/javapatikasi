package KalitimInheritence;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("esengulcinel", "05555555555", "deneme@test.com");
        System.out.println(c1.getadSoyad());
        c1.cikis();
        Akedemisyen a1 = new Akedemisyen("cinelesengul", "123123123", "test@deneme.com", "CENG", "doc");
        System.out.println(a1.getadSoyad());
        a1.dersegir();

        a1.giris();

        //polymorphism çok biçimlilik
        //Calisan sınıfından akedemsiyen nesnesini oluşturduk.
        Calisan a2=new Akedemisyen("cinel","39204","info@test.com","CENG","doc");

       // int[] loginUser= new int[5];
        Calisan[] loginUser={a1,c1};
        Calisan.girisYapanlar(loginUser);
    }
}
