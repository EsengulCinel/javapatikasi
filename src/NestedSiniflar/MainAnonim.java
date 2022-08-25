package NestedSiniflar;

public class MainAnonim {
    public static void main(String[] args) {


        Anonim anonim = new Anonim() { // bu kod blokları arasında metotlar ve değişkenler tanımlayabiliriz.

            @Override
            public void run(){
                System.out.println("Anonim olarak yazilmis run metodu !");
            }


        };
        anonim.run();
    }
}
