package ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        System.out.println("basladi !! ");
        int a = 0;
        int b = 20;
        try {  // hata alınabilecek muhtemel yeri koyduk

            System.out.println("bolme basladi");
            System.out.println(b / a);  // bu hata aldıgı yerde catch içine giriyor kodu işlemeyi devam ettirmeden
            System.out.println("bolme bitti");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hata yakalandi");
        }finally {
            System.out.println("bu kisim kesinlikle calisacak");
        }
        System.out.println("bitti !! ");

    }
}
