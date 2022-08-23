package Encapsulation;

//anlamsızlıkların önüne geçmeye çalışıyoruz.
//kitap sayfa sayısı - olamaz örneğin
public class Main {
    public static void main(String[] args) {
        Book b = new Book("Harry Potter", 500);
        Book k = new Book("LOTR", -100);
//        k.changePageNumber(500);
//        System.out.println(k.showPageNumber());
        k.setName("asd");  //değiştirdik
        System.out.println(k.getName());  // getirdik
    }
}
