package Collection;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> liste =new java.util.LinkedList<>();
        liste.add("esen");
        liste.add("gul");
        liste.add("cinel");


        liste.remove("esen"); //birden fazla varsa buldugu ilk degeri sildiriyor.
        Iterator<String> itr=liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
