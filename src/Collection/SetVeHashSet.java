package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetVeHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();    //içi boş bir liste oluşturduk veee boyut vermedik. Verdikce genişleyecek :D
        hSet.add(10);                               //sete kümeye listeye veri eklerken
        hSet.add(20);
        hSet.add(10);
        hSet.add(30);
        hSet.add(null);

        // System.out.println(hSet.size());
        // System.out.println(hSet.isEmpty());
        // System.out.println(hSet.contains(20));           //liste içinde var mı yok mu diye sorgular boolean true false döner
        // hSet.remove(10);                              //belli bir değer sildik
        // hSet.clear();                               //hepsini sildik


        //   for (Integer sayi : hSet) {                 //ekrana bastırırken bir iterator kullanarak bastırabiliriz bir de for each kullanarak
        //   System.out.println(sayi);               //cıktıda tekrar eden sayilar sadece BİR KERE yazılır. Ve sırasız çıkar. Sıralama hafızadaki hash'e göre.


        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}

