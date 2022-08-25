package NestedSiniflar;

public class WrapperSinif {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 20;
        String str = "abc";


        //integer bir değeri bir string'e çevirmek istiyoruz.
        Integer x = 20;
        String s = x.toString();
        System.out.println(s);



        String  v="10";
        int c=Integer.parseInt(v);
        System.out.println(c+4);


        //Autoboxing
        int f=10;

        Integer h=f;

        //Boxing
        Integer l=Integer.valueOf(f);


    }
}
