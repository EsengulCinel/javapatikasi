package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListler {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(5);

        System.out.println(liste.size()); //boyutu döndü
        System.out.println(liste.get(3));  //elamana eriştik
        System.out.println(liste.indexOf(null));  //bulmak istediğmiz değeri girip indis numarasını bulabiliriz.
        //contains true şeklinde arama sağlıyor.

        liste.add(2,null);
        liste.set(2,15);

        Iterator<Integer> itr =liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        //System.out.println(liste);
    }
}
