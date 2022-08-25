package NestedSiniflar;

//outer class
public class Out {
    public int a = 5;

    //inner class
    public static class In {
        public int a = 10;


        public static void run() {
            int a = 1;
            System.out.println(a);
            // System.out.println(this.a); //sınıfa ait a'yı bastırdık
            // System.out.println(Out.this.a); //dış sınıfa ait değişkene ulaşabilmek için
        }
    }

    public void run() {

        //   In in =new In();
        In.run();
    }
}
